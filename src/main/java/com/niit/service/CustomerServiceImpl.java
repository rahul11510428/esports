package com.niit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CustomerDao;
import com.niit.model.Customer;
import com.niit.model.User;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
	
	public void CustomerServiceImpl()
	{
		System.out.println(" Object is created");
	}

	@Autowired
	private CustomerDao customerDao;
	
	public void registerCustomer(Customer customer) {
		
		customerDao.registerCustomer(customer);
		
	}

	public User validateUser(String username) {
 		return customerDao.validateUser(username);
	}

	public Customer validateCustomer(String email) {
		 
		return  customerDao.validateCustomer(email);
	}

	
}
