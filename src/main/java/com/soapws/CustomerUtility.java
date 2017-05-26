package com.soapws;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.soapwebservice.customer.Customer;

@Component
public class CustomerUtility {
	private Map<String, Customer> customerMap = new HashMap<String, Customer>();

	public CustomerUtility() {
		Customer c1 = new Customer();
		c1.setFirstname("Ram");
		c1.setLastname("gopal");
		c1.setAge(20);
		c1.setEmailid("ram@gmail.com");
		c1.setPhone(231312120);
		c1.setMonthlySalary(4000);
		customerMap.put("15AC11", c1);
		Customer c2 = new Customer();
		c2.setFirstname("Ajay");
		c2.setLastname("Patil");
		c2.setAge(22);
		c2.setEmailid("ajay@gmail.com");
		c2.setPhone(587948758);
		c2.setMonthlySalary(3000);
		customerMap.put("15HN78", c2);
		Customer c3 = new Customer();
		c3.setFirstname("Ajay");
		c3.setLastname("Patil");
		c3.setAge(22);
		c3.setEmailid("ajay@gmail.com");
		c3.setPhone(247948758);
		c3.setMonthlySalary(3000);
		customerMap.put("15HA78", c2);
	}

	public Customer getCustomer(String ssn) {
		Customer customer = customerMap.get(ssn);
		return customer;
	}
}