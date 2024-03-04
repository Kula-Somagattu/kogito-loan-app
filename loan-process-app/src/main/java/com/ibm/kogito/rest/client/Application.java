package com.ibm.kogito.rest.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Application {

    @JsonProperty("id")
    private String applicationId;
    @JsonProperty("amount")
    private int amount;
        
    public String getApplicationId() {
        return applicationId;
    }
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    @Override
    public String toString() {
        return "LoanApplication [applicationId=" + applicationId + ", amount=" + amount  + "]";
    }
    


}
