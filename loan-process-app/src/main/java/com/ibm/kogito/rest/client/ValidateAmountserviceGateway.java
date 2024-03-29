package com.ibm.kogito.rest.client;

import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/LoanApplicationRules")
@RegisterRestClient(configKey = "loan-rules-app")
public interface ValidateAmountserviceGateway { 

   @POST
   @Produces(MediaType.APPLICATION_JSON)
   @Consumes(MediaType.APPLICATION_JSON)
   LoanApplicationResponse validateAmount(Map<String, Object> parameters);

}
