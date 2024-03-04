package com.ibm.kogito.rest.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LoanApplicationResponse {

    
    @JsonProperty("LoanApplication")
    private Application loanApplication;
    @JsonProperty("ApplicationStatus")
    private ApplicationStatus status;

    public ApplicationStatus getStatus() {
        return status;
    }
    public void setStatus(ApplicationStatus status) {
        this.status = status;
    }
    
    public Application getLoanApplication() {
        return loanApplication;
    }
    public void setLoanApplication(Application loanApplication) {
        this.loanApplication = loanApplication;
    }
    
    @Override
    public String toString() {
        return "LoanApplicationResponse [loanApplication=" + loanApplication + ", status=" + status + "]";
    }
       

}
