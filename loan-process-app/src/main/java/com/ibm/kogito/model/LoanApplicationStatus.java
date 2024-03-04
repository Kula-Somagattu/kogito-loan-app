package com.ibm.kogito.model;



public class LoanApplicationStatus {

    private String applicationId;
    private Status status;    
    private String reason;
    
    public LoanApplicationStatus() {        
    }
    public String getApplicationId() {
        return applicationId;
    }
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "LoanApplicationStatus [applicationId=" + applicationId + ", status=" + status + ", reason=" + reason
                + "]";
    }    

}
