package com.ibm.kogito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.junit.jupiter.api.Test;
import org.kie.kogito.Model;
import org.kie.kogito.auth.IdentityProviders;
import org.kie.kogito.auth.SecurityPolicy;
import org.kie.kogito.process.ProcessInstance;
import org.kie.kogito.process.WorkItem;

import com.ibm.kogito.model.LoanApplication;

public class LoanApplicationProcessTest {

    // @Named("LoanApplicationProcess")
    // @Inject
    // Process<? extends Model> loanApplicationProcess;

    // @Test
    // public void testApprovedLoanApplication(){
    //     assertNotNull(loanApplicationProcess);

    //     Model model = loanApplicationProcess.createModel();

    //     Map<String, Object> parameters = new HashMap<>();
    //     Applicant applicant = new Applicant();
    //     applicant.setName("John");
    //     applicant.setAge(25);
    //     applicant.setCreditScore(700);
    //     LoanApplication application = new LoanApplication();
    //     application.setApplicant(applicant);
    //     application.setApplicationNumber(111);
    //     application.setLoanAmount(100000.0);
    //     parameters.put("application",application);
    //     model.fromMap(parameters);

    //     ProcessInstance<?> processInstance = loanApplicationProcess.createInstance(model);
    //     processInstance.start();
    //     System.out.println("Status " + processInstance.status());
    //     assertEquals(org.kie.kogito.process.ProcessInstance.STATE_COMPLETED, processInstance.status());

    // }

    // @Test
    // public void testAgeRejectedLoanApplication(){
    //     assertNotNull(loanApplicationProcess);

    //     Model model = loanApplicationProcess.createModel();

    //     Map<String, Object> parameters = new HashMap<>();
    //     Applicant applicant = new Applicant();
    //     applicant.setName("John");
    //     applicant.setAge(10);
    //     applicant.setCreditScore(700);
    //     LoanApplication application = new LoanApplication();
    //     application.setApplicant(applicant);
    //     application.setApplicationNumber(111);
    //     application.setLoanAmount(100000.0);
    //     parameters.put("application",application);
    //     model.fromMap(parameters);

    //     ProcessInstance<?> processInstance = loanApplicationProcess.createInstance(model);
    //     processInstance.start();               
    //     assertEquals(org.kie.kogito.process.ProcessInstance.STATE_ACTIVE, processInstance.status());

    //     SecurityPolicy policy = SecurityPolicy.of(IdentityProviders.of("jdoe", Arrays.asList("user")));
        
    //     List<WorkItem> workItems = processInstance.workItems(policy);
    //     assertEquals(1, workItems.size());
    //     application.setApproved(false);
    //     application.addReason("too young");        
    //     processInstance.completeWorkItem(workItems.get(0).getId(),Map.of("application", application));
    //     assertEquals(org.kie.api.runtime.process.ProcessInstance.STATE_COMPLETED, processInstance.status());

    // }   
    
    // @Test
    // public void testAmountRejectedLoanApplication(){
    //     assertNotNull(loanApplicationProcess);

    //     Model model = loanApplicationProcess.createModel();

    //     Map<String, Object> parameters = new HashMap<>();
    //     Applicant applicant = new Applicant();
    //     applicant.setName("John");
    //     applicant.setAge(20);
    //     applicant.setCreditScore(700);
    //     LoanApplication application = new LoanApplication();
    //     application.setApplicant(applicant);
    //     application.setApplicationNumber(111);
    //     application.setLoanAmount(10000000.0);
    //     parameters.put("application",application);
    //     model.fromMap(parameters);

    //     ProcessInstance<?> processInstance = loanApplicationProcess.createInstance(model);
    //     processInstance.start();               
    //     assertEquals(org.kie.kogito.process.ProcessInstance.STATE_ACTIVE, processInstance.status());

    //     SecurityPolicy policy = SecurityPolicy.of(IdentityProviders.of("jdoe", Arrays.asList("user")));
        
    //     List<WorkItem> workItems = processInstance.workItems(policy);
    //     assertEquals(1, workItems.size());
    //     application.setApproved(false);
    //     application.addReason("too young");        
    //     processInstance.completeWorkItem(workItems.get(0).getId(),Map.of("application", application));
    //     assertEquals(org.kie.api.runtime.process.ProcessInstance.STATE_COMPLETED, processInstance.status());

    // } 

}
