package com.ibm.kogito.model;

public class LoanApplication {
    private String applicationId;
    private LoanApplicant applicant; 
    private int loanAmount;    
    
    
    public LoanApplication() {
    }
    
    public String getApplicationId() {
        return applicationId;
    }
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }
    public LoanApplicant getApplicant() {
        return applicant;
    }
    public void setApplicant(LoanApplicant applicant) {
        this.applicant = applicant;
    }
    public int getLoanAmount() {
        return loanAmount;
    }
    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }
    
    @Override
    public String toString() {
        return "LoanApplication [applicationId=" + applicationId + ", applicant=" + applicant + ", loanAmount=" + loanAmount + "]";
    }
    
}
