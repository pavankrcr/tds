package com.pavank.tds.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class salary {
    @Id
    private long id;
    private String MonthYear;
    private String EmployeeNo;
    private String EmplyoeeName;
    private String CostCenter;
    private String PersonnalArea;
    private String PersonnalAreaText;
    private String PersonnalSubArea;
    private String PersonnalSubAreaText;
    private String BankAccountNo;
    private String SalaryPerMonth;
    private String BasicDA;
    private String LTA;
    private String Gratuity;
    private String LTAARRS;
    private String PersonalAllowance;
    private String PersonalArrears;
    private String Stipend;
    private String StipendArrears;
    private String ARREARSBasicDA;
    private String HRA;
    private String ARREARSHRA;
    private String Conv;
    private String Convarrs;
    private String MedicalAllowance;
    private String ARREARSMedicalAllowance;
    private String ChildEducationAllowance;
    private String ARREARSChildEduAllow;
    private String MGBARREARS;
    private String MGB;
    private String Flexi;
    private String FlexiArrears;
    private String SPLAllownace;
    private String ARREARSPLAllownace;
    private String OverTimeHrs;
    private String OverTimeAmt;
    private String OTARREARS;
    private String Gross;
    private String RTGross;
    private String RTTotalArrears;
    private String TotalArrears;
    private String FestivalEMI;
    private String SalaryEMI;
    private String Canteen;
    private String OthDeduction;
    private String Transportation;
    private String Mediclaim;
    private String TelephoneDedu;
    private String UnionContribution;
    private String LICDeduction;
    private String CompDeduction;
    private String RTTotalDeduction;
    private String PF;
    private String ARREARSPF;
    private String PT;
    private String ARREARSPT;
    private String TDS;
    private String ESIC;
    private String ONEDAY;
    private String LWF;
    private String TotalDeduction;
    private String StatutoryNet;
    private String NetPay;
    private String RTNetPay;
    private String NoofdaysinMonth;
    private String LOPDays;
    private String NoofDayspaid;
    private String PanNo;

    public void setMonthYear(String monthYear) {
        this.MonthYear = monthYear;
    }

    public void setEmployeeNo(String employeeNo) {
        this.EmployeeNo = employeeNo;
    }

    public void setEmplyoeeName(String emplyoeeName) {
        this.EmplyoeeName = emplyoeeName;
    }

    public void setCostCenter(String costCenter) {
        this.CostCenter = costCenter;
    }

    public void setPersonnalArea(String personnalArea) {
        this.PersonnalArea = personnalArea;
    }

    public void setPersonnalAreaText(String personnalAreaText) {
        this.PersonnalAreaText = personnalAreaText;
    }

    public void setPersonnalSubArea(String personnalSubArea) {
        this.PersonnalSubArea = personnalSubArea;
    }

    public void setPersonnalSubAreaText(String personnalSubAreaText) {
        this.PersonnalSubAreaText = personnalSubAreaText;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.BankAccountNo = bankAccountNo;
    }

    public void setSalaryPerMonth(String salaryPerMonth) {
        this.SalaryPerMonth = salaryPerMonth;
    }

    public void setBasicDA(String basicDA) {
        this.BasicDA = basicDA;
    }

    public void setLTA(String lTA) {
        this.LTA = lTA;
    }

    public void setGratuity(String gratuity) {
        this.Gratuity = gratuity;
    }

    public void setLTAARRS(String lTAARRS) {
        this.LTAARRS = lTAARRS;
    }

    public void setPersonalAllowance(String personalAllowance) {
        this.PersonalAllowance = personalAllowance;
    }

    public void setPersonalArrears(String personalArrears) {
        this.PersonalArrears = personalArrears;
    }

    public void setStipend(String stipend) {
        this.Stipend = stipend;
    }

    public void setStipendArrears(String stipendArrears) {
        this.StipendArrears = stipendArrears;
    }

    public void setARREARSBasicDA(String aRREARSBasicDA) {
        this.ARREARSBasicDA = aRREARSBasicDA;
    }

    public void setHRA(String hRA) {
        this.HRA = hRA;
    }

    public void setARREARSHRA(String aRREARSHRA) {
        this.ARREARSHRA = aRREARSHRA;
    }

    public void setConv(String conv) {
        this.Conv = conv;
    }

    public void setConvarrs(String convarrs) {
        this.Convarrs = convarrs;
    }

    public void setMedicalAllowance(String medicalAllowance) {
        this.MedicalAllowance = medicalAllowance;
    }

    public void setARREARSMedicalAllowance(String aRREARSMedicalAllowance) {
        this.ARREARSMedicalAllowance = aRREARSMedicalAllowance;
    }

    public void setChildEducationAllowance(String childEducationAllowance) {
        this.ChildEducationAllowance = childEducationAllowance;
    }

    public void setARREARSChildEduAllow(String aRREARSChildEduAllow) {
        this.ARREARSChildEduAllow = aRREARSChildEduAllow;
    }

    public void setMGBARREARS(String mGBARREARS) {
        this.MGBARREARS = mGBARREARS;
    }

    public void setMGB(String mGB) {
        this.MGB = mGB;
    }

    public void setFlexi(String flexi) {
        this.Flexi = flexi;
    }

    public void setFlexiArrears(String flexiArrears) {
        this.FlexiArrears = flexiArrears;
    }

    public void setSPLAllownace(String sPLAllownace) {
        this.SPLAllownace = sPLAllownace;
    }

    public void setARREARSPLAllownace(String aRREARSPLAllownace) {
        this.ARREARSPLAllownace = aRREARSPLAllownace;
    }

    public void setOverTimeHrs(String overTimeHrs) {
        this.OverTimeHrs = overTimeHrs;
    }

    public void setOverTimeAmt(String overTimeAmt) {
        this.OverTimeAmt = overTimeAmt;
    }

    public void setOTARREARS(String oTARREARS) {
        this.OTARREARS = oTARREARS;
    }

    public void setGross(String gross) {
        this.Gross = gross;
    }

    public void setRTGross(String rTGross) {
        this.RTGross = rTGross;
    }

    public void setRTTotalArrears(String rTTotalArrears) {
        this.RTTotalArrears = rTTotalArrears;
    }

    public void setTotalArrears(String totalArrears) {
        this.TotalArrears = totalArrears;
    }

    public void setFestivalEMI(String festivalEMI) {
        this.FestivalEMI = festivalEMI;
    }

    public void setSalaryEMI(String salaryEMI) {
        this.SalaryEMI = salaryEMI;
    }

    public void setCanteen(String canteen) {
        this.Canteen = canteen;
    }

    public void setOthDeduction(String othDeduction) {
        this.OthDeduction = othDeduction;
    }

    public void setTransportation(String transportation) {
        this.Transportation = transportation;
    }

    public void setMediclaim(String mediclaim) {
        this.Mediclaim = mediclaim;
    }

    public void setTelephoneDedu(String telephoneDedu) {
        this.TelephoneDedu = telephoneDedu;
    }

    public void setUnionContribution(String unionContribution) {
        this.UnionContribution = unionContribution;
    }

    public void setLICDeduction(String lICDeduction) {
        this.LICDeduction = lICDeduction;
    }

    public void setCompDeduction(String compDeduction) {
        this.CompDeduction = compDeduction;
    }

    public void setRTTotalDeduction(String rTTotalDeduction) {
        this.RTTotalDeduction = rTTotalDeduction;
    }

    public void setPF(String pF) {
        this.PF = pF;
    }

    public void setARREARSPF(String aRREARSPF) {
        this.ARREARSPF = aRREARSPF;
    }

    public void setPT(String pT) {
        this.PT = pT;
    }

    public void setARREARSPT(String aRREARSPT) {
        this.ARREARSPT = aRREARSPT;
    }

    public void setTDS(String tDS) {
        this.TDS = tDS;
    }

    public void setESIC(String eSIC) {
        this.ESIC = eSIC;
    }

    public void setONEDAY(String oNEDAY) {
        this.ONEDAY = oNEDAY;
    }

    public void setLWF(String lWF) {
        this.LWF = lWF;
    }

    public void setTotalDeduction(String totalDeduction) {
        this.TotalDeduction = totalDeduction;
    }

    public void setStatutoryNet(String statutoryNet) {
        this.StatutoryNet = statutoryNet;
    }

    public void setNetPay(String netPay) {
        this.NetPay = netPay;
    }

    public void setRTNetPay(String rTNetPay) {
        this.RTNetPay = rTNetPay;
    }

    public void setNoofdaysinMonth(String noofdaysinMonth) {
        this.NoofdaysinMonth = noofdaysinMonth;
    }

    public void setLOPDays(String lOPDays) {
        this.LOPDays = lOPDays;
    }

    public void setNoofDayspaid(String noofDayspaid) {
        this.NoofDayspaid = noofDayspaid;
    }

    public void setPanNo(String panNo) {
        this.PanNo = panNo;
    }

    public String getMonthYear() {
        return MonthYear;
    }

    public String getEmployeeNo() {
        return EmployeeNo;
    }

    public String getEmplyoeeName() {
        return EmplyoeeName;
    }

    public String getCostCenter() {
        return CostCenter;
    }

    public String getPersonnalArea() {
        return PersonnalArea;
    }

    public String getPersonnalAreaText() {
        return PersonnalAreaText;
    }

    public String getPersonnalSubArea() {
        return PersonnalSubArea;
    }

    public String getPersonnalSubAreaText() {
        return PersonnalSubAreaText;
    }

    public String getBankAccountNo() {
        return BankAccountNo;
    }

    public String getSalaryPerMonth() {
        return SalaryPerMonth;
    }

    public String getBasicDA() {
        return BasicDA;
    }

    public String getLTA() {
        return LTA;
    }

    public String getGratuity() {
        return Gratuity;
    }

    public String getLTAARRS() {
        return LTAARRS;
    }

    public String getPersonalAllowance() {
        return PersonalAllowance;
    }

    public String getPersonalArrears() {
        return PersonalArrears;
    }

    public String getStipend() {
        return Stipend;
    }

    public String getStipendArrears() {
        return StipendArrears;
    }

    public String getARREARSBasicDA() {
        return ARREARSBasicDA;
    }

    public String getHRA() {
        return HRA;
    }

    public String getARREARSHRA() {
        return ARREARSHRA;
    }

    public String getConv() {
        return Conv;
    }

    public String getConvarrs() {
        return Convarrs;
    }

    public String getMedicalAllowance() {
        return MedicalAllowance;
    }

    public String getARREARSMedicalAllowance() {
        return ARREARSMedicalAllowance;
    }

    public String getChildEducationAllowance() {
        return ChildEducationAllowance;
    }

    public String getARREARSChildEduAllow() {
        return ARREARSChildEduAllow;
    }

    public String getMGBARREARS() {
        return MGBARREARS;
    }

    public String getMGB() {
        return MGB;
    }

    public String getFlexi() {
        return Flexi;
    }

    public String getFlexiArrears() {
        return FlexiArrears;
    }

    public String getSPLAllownace() {
        return SPLAllownace;
    }

    public String getARREARSPLAllownace() {
        return ARREARSPLAllownace;
    }

    public String getOverTimeHrs() {
        return OverTimeHrs;
    }

    public String getOverTimeAmt() {
        return OverTimeAmt;
    }

    public String getOTARREARS() {
        return OTARREARS;
    }

    public String getGross() {
        return Gross;
    }

    public String getRTGross() {
        return RTGross;
    }

    public String getRTTotalArrears() {
        return RTTotalArrears;
    }

    public String getTotalArrears() {
        return TotalArrears;
    }

    public String getFestivalEMI() {
        return FestivalEMI;
    }

    public String getSalaryEMI() {
        return SalaryEMI;
    }

    public String getCanteen() {
        return Canteen;
    }

    public String getOthDeduction() {
        return OthDeduction;
    }

    public String getTransportation() {
        return Transportation;
    }

    public String getMediclaim() {
        return Mediclaim;
    }

    public String getTelephoneDedu() {
        return TelephoneDedu;
    }

    public String getUnionContribution() {
        return UnionContribution;
    }

    public String getLICDeduction() {
        return LICDeduction;
    }

    public String getCompDeduction() {
        return CompDeduction;
    }

    public String getRTTotalDeduction() {
        return RTTotalDeduction;
    }

    public String getPF() {
        return PF;
    }

    public String getARREARSPF() {
        return ARREARSPF;
    }

    public String getPT() {
        return PT;
    }

    public String getARREARSPT() {
        return ARREARSPT;
    }

    public String getTDS() {
        return TDS;
    }

    public String getESIC() {
        return ESIC;
    }

    public String getONEDAY() {
        return ONEDAY;
    }

    public String getLWF() {
        return LWF;
    }

    public String getTotalDeduction() {
        return TotalDeduction;
    }

    public String getStatutoryNet() {
        return StatutoryNet;
    }

    public String getNetPay() {
        return NetPay;
    }

    public String getRTNetPay() {
        return RTNetPay;
    }

    public String getNoofdaysinMonth() {
        return NoofdaysinMonth;
    }

    public String getLOPDays() {
        return LOPDays;
    }

    public String getNoofDayspaid() {
        return NoofDayspaid;
    }

    public String getPanNo() {
        return PanNo;
    }
}