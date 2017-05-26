package com.soapws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soapwebservice.customer.GetCustomerRequest;
import com.soapwebservice.customer.GetCustomerResponse;

@Endpoint
public class CustomerEndpoint {
	private static final String NAMESPACE_URI = "http://soapwebservice.com/customer";
	@Autowired
	private CustomerUtility customerUtility;	

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCustomerRequest")
	@ResponsePayload
	public GetCustomerResponse getCountry(@RequestPayload GetCustomerRequest request) {
		GetCustomerResponse response = new GetCustomerResponse();
		response.setCustomer(customerUtility.getCustomer(request.getSsn()));
		return response;
	}
}
