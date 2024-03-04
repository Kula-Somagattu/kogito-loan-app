package com.ibm.kogito.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.jboss.logging.Logger;

import com.ibm.kogito.model.LoanApplication;

@ApplicationScoped
public class InitializeLoanApplication {

    @Inject
    Logger logger;

    public LoanApplication initialize(LoanApplication loanApplication) {
       
        return loanApplication;
        
    }

}
