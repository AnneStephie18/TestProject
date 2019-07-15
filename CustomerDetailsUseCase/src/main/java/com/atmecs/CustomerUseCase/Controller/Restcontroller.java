package com.atmecs.CustomerUseCase.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.atmecs.CustomerUseCase.Customer.Customer;
import com.atmecs.CustomerUseCase.CustomerDetails.AddingCustomerDetails;

@RestController
public class Restcontroller {
	 

	    @Autowired
	    private AddingCustomerDetails customerDetails;
	 
	    @RequestMapping("/")
	    @ResponseBody
	    
	    public String welcome() {
	        return "Welcome to RestTemplate Example.";
	    }
	 
	  
	    @RequestMapping(value = "/customers", //
	            method = RequestMethod.GET, //
	            produces = { MediaType.APPLICATION_JSON_VALUE, //
	                    MediaType.APPLICATION_XML_VALUE })
	    @ResponseBody
	    public List<Customer> getCustomers() {
	        List<Customer> list = customerDetails.getAllCustomers();
	        return list;
	    }
	 
	   
	    @RequestMapping(value = "/customer/{email}", //
	            method = RequestMethod.GET, //
	            produces = { MediaType.APPLICATION_JSON_VALUE, //
	                    MediaType.APPLICATION_XML_VALUE })
	    @ResponseBody
	    public Customer getCustomer(@PathVariable("email") String email) {
	        return customerDetails.getCustomer(email);
	    }
	 
	  
	 
	    @RequestMapping(value = "/customer", //
	            method = RequestMethod.POST, //
	            produces = { MediaType.APPLICATION_JSON_VALUE, //
	                    MediaType.APPLICATION_XML_VALUE })
	    @ResponseBody
	    public Customer addCustomer(@RequestBody Customer customer) {
	 
	        System.out.println("(Service Side) Creating employee: " + customer.getEmail());
	 
	        return customerDetails.addCustomer(customer);
	    }
	
	    @RequestMapping(value = "/customer", //
	            method = RequestMethod.PUT, //
	            produces = { MediaType.APPLICATION_JSON_VALUE, //
	                    MediaType.APPLICATION_XML_VALUE })
	    @ResponseBody
	    public Customer updateCustomer(@RequestBody Customer customer) {
	 
	        System.out.println("(Service Side) Editing employee: " + customer.getEmail());
	 
	        return customerDetails.updateCustomer(customer);
	    }
	 
	  
	    @RequestMapping(value = "/customer/{email}", //
	            method = RequestMethod.DELETE, //
	            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	    @ResponseBody
	    public void deleteCustomer(@PathVariable("email") String email) {
	 
	        System.out.println("(Service Side) Deleting employee: " + email);
	 
	        customerDetails.deleteCustomer(email);
	    }
	 
	}


