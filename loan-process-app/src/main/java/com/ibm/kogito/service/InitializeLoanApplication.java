package com.ibm.kogito.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;

import com.ibm.kogito.model.LoanApplication;

@ApplicationScoped
public class InitializeLoanApplication {

    @Inject
    Logger logger;

    @ConfigProperty(name = "quarkus.rest-client.loan-rules-app.url") 
    String URL;
    
    public LoanApplication initialize(LoanApplication loanApplication) {

        System.out.println("URL :" + URL); 
        return loanApplication;
        
    }

}
