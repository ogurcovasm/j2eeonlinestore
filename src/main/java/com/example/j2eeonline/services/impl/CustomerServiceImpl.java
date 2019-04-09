package com.example.j2eeonline.services.impl;

import com.example.j2eeonline.dao.CustomerDao;
import com.example.j2eeonline.domain.CustomerEntity;
import com.example.j2eeonline.services.CustomerService;

/**
 * Service providing service methods to work this customer data and entity.
 * 
 * @author Svetlana Ogurcova
 *
 */
public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;
	
	/**
	 * Create user - persist to database
	 * 
	 * @param customerEntity
	 * @return true if success
	 */
	public boolean createCustomer(CustomerEntity customerEntity) {
		customerDao.save(customerEntity);
		return true;
	}

	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
}
