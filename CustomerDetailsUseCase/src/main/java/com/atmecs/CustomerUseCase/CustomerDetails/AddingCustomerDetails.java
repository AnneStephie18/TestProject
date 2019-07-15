package com.atmecs.CustomerUseCase.CustomerDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

import com.atmecs.CustomerUseCase.Customer.Customer;

@Repository
public class AddingCustomerDetails {
	private static final Map<String, Customer> empMap = new HashMap<String, Customer>();
	 
    static {
        initEmps();
        
    }

    private static void initEmps() {
    	Customer customer1 = new Customer("ANNE","S",23,1233456678,"FEMALE","THATHAIPERIYAR NAGAR","TRICHY","TAMILNADU",630003,"INDIA","anne1234@gmail.com");
    	Customer customer2 = new Customer("BANU","S",30,98766543,"FEMALE","NEHRU NAGAR","MADURAI","TAMILNADU",730003,"INDIA","banu9876@gmail.com");
    	Customer customer3 = new Customer("KAYAL","S",35,932563777,"FEMALE","PERIYAR NAGAR","CHENNAI","TAMILNADU",800003,"INDIA","kayal1298@gmail.com");
 
        empMap.put(customer1.getEmail(), customer1);
        empMap.put(customer2.getEmail(), customer2);
        empMap.put(customer3.getEmail(), customer3);
    }
 
    public Customer getEmployee(String getEmail) {
        return empMap.get(getEmail);
    }
 
    public Customer addEmployee(Customer customer) {
        empMap.put(customer.getEmail(), customer);
        return customer;
    }
 
    public Customer updateEmployee(Customer customer) {
        empMap.put(customer.getEmail(), customer);
        return customer;
    }
 
    public void deleteEmployee(String email) {
        empMap.remove(email);
    }
 
    public List<Customer> getAllEmployees() {
        Collection<Customer> c = empMap.values();
        List<Customer> list = new ArrayList<Customer>();
        list.addAll(c);
        return list;
    }
}
