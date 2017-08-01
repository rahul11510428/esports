package com.niit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CustomerDao;
import com.niit.model.Customer;
import com.niit.model.User;

@Service
@Transactional
/* @Repository */
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	public void registerCustomer(Customer customer) {

		customerDao.registerCustomer(customer);

	}

	public User validateUser(String username) {
		return customerDao.validateUser(username);
	}

	public Customer validateCustomer(String email) {

		return customerDao.validateCustomer(email);
	}

	public Customer getCustomerByUsername(String username) {

		return customerDao.getCustomerByUsername(username);
	}

	 
	public Customer getCustomerByAnswer(String answer)
	{
		return customerDao.getCustomerByAnswer(answer);
	}
	
	public void updateUser(String password,String username) {
	  
		customerDao.updateUser(password,username);
		
	}

	 

}
