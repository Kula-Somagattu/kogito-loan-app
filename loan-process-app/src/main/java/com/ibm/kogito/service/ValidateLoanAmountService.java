package com.ibm.kogito.service;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

import com.ibm.kogito.model.LoanApplication;
import com.ibm.kogito.model.LoanApplicationStatus;
import com.ibm.kogito.rest.client.Application;
import com.ibm.kogito.rest.client.LoanApplicationResponse;
import com.ibm.kogito.rest.client.ValidateAmountserviceGateway;

@ApplicationScoped
public class ValidateLoanAmountService {

    @Inject
    Logger logger;

    @Inject
    @RestClient
    ValidateAmountserviceGateway validateAmountserviceGateway;

    public LoanApplicationStatus validateLoanAmount(LoanApplication loanApplication) {

        Application application = new Application();
        application.setApplicationId(loanApplication.getApplicationId());
        application.setAmount(loanApplication.getLoanAmount());

        Map<String, Object> params = new HashMap<>();
        params.put("LoanApplication", application);
        params.put("LoanApplicant", loanApplication.getApplicant());

        LoanApplicationResponse response = validateAmountserviceGateway.validateAmount(params);

        LoanApplicationStatus loanApplicationStatus = new LoanApplicationStatus();        
        loanApplicationStatus.setApplicationId(response.getLoanApplication().getApplicationId());
        loanApplicationStatus.setStatus(response.getStatus().getStatus());
        loanApplicationStatus.setReason(response.getStatus().getReason());       

        return loanApplicationStatus;
        
    }

}
