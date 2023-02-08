package com.pavan.tds.data;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import com.pavank.tds.model.salary;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

    private final String[] FIELD_NAMES = new String[] { "id","EmployeeNo","MonthYear","EmplyoeeName","CostCenter","PersonnalArea","PersonnalAreaText","PersonnalSubArea","PersonnalSubAreaText","SalaryPerMonth","BankAccountNo","BasicDA","LTA","Gratuity","LTAARRS","PersonalAllowance","PersonalArrears","Stipend","StipendArrears","ARREARSBasicDA","HRA","ARREARSHRA","Conv","Convarrs","MedicalAllowance","ARREARSMedicalAllowance","ChildEducationAllowance","ARREARSChildEduAllow","MGBARREARS","MGB","Flexi","FlexiArrears","SPLAllownace","ARREARSPLAllownace","OverTimeHrs","OverTimeAmt","OTARREARS","Gross","RTGross","RTTotalArrears","TotalArrears","FestivalEMI","SalaryEMI","Canteen","OthDeduction","Transportation","Mediclaim","TelephoneDedu","UnionContribution","LICDeduction","CompDeduction","RTTotalDeduction","PF","ARREARSPF","PT","ARREARSPT","TDS","ESIC","ONEDAY","LWF","TotalDeduction","StatutoryNet","NetPay","RTNetPay","NoofdaysinMonth","LOPDays","NoofDayspaid","PanNo" };

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Bean
    public FlatFileItemReader<MatchInput> reader() {
        return new FlatFileItemReaderBuilder<salaryinput>().name("SalaryItemReader")
                .resource(new ClassPathResource("salaryinput.csv")).delimited().names(FIELD_NAMES)
                .fieldSetMapper(new BeanWrapperFieldSetMapper<salaryinput>() {
                    {
                        setTargetType(salaryinput.class);
                    }
                }).build();
    }

    @Bean
    public MatchDataProcessor processor() {
        return new MatchDataProcessor();
    }

    @Bean
    public JdbcBatchItemWriter<Match> writer(DataSource dataSource) {
        return new JdbcBatchItemWriterBuilder<Match>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql("INSERT INTO salary (id,Employee_no,Month_year,Emplyoee_name,Cost_center,Personnal_area,Personnal_area_text,Personnal_sub_area,Personnal_sub_area_text,Salary_per_month,BankAccountNo,BasicDA,LTA,Gratuity,LTAARRS,PersonalAllowance,PersonalArrears,Stipend,StipendArrears,ARREARSBasicDA,HRA,ARREARSHRA,Conv,Convarrs,MedicalAllowance,ARREARSMedicalAllowance,ChildEducationAllowance,ARREARSChildEduAllow,MGBARREARS,MGB,Flexi,FlexiArrears,SPLAllownace,ARREARSPLAllownace,OverTimeHrs,OverTimeAmt,OTARREARS,Gross,RTGross,RTTotalArrears,TotalArrears,FestivalEMI,SalaryEMI,Canteen,OthDeduction,Transportation,Mediclaim,TelephoneDedu,UnionContribution,LICDeduction,CompDeduction,RTTotalDeduction,PF,ARREARSPF,PT,ARREARSPT,TDS,ESIC,ONEDAY,LWF,TotalDeduction,StatutoryNet,NetPay,RTNetPay,NoofdaysinMonth,LOPDays,NoofDayspaid,PanNo ) "
                        + " VALUES (:id, :city, :date, :playerOfMatch, :venue, :team1, :team2, :tossWinner, :tossDecision, :matchWinner, :result, :resultMargin, :umpire1, :umpire2)")
                .dataSource(dataSource).build();
    }

    @Bean
    public Job importUserJob(JobCompletionNotificationListener listener, Step step1) {
        return jobBuilderFactory
            .get("importUserJob")
            .incrementer(new RunIdIncrementer())
            .listener(listener)
            .flow(step1)
            .end()
            .build();
    }

    @Bean
    public Step step1(JdbcBatchItemWriter<Match> writer) {
        return stepBuilderFactory
            .get("step1")
            .<MatchInput, Match>chunk(10)
            .reader(reader())
            .processor(processor())
            .writer(writer)
            .build();
    }
}
