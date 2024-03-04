package com.ibm.kogito.rest.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.kogito.model.Status;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicationStatus {

     @JsonProperty("status")
    private Status status;
    @JsonProperty("reason")
    private String reason;

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
        return "ApplicantStatus [status=" + status + ", reason=" + reason + "]";
    }
    

}
