package com.example.j2eeonline.services;

import com.example.j2eeonline.domain.CustomerEntity;

/**
 * Service providing service methods to work this customer data and entity.
 * 
 * @author Svetlana Ogurcova
 *
 */
public interface CustomerService {

	/**
	 * Create customer - persist to database
	 * 
	 * @param customerEntity
	 * @return true if success
	 */
	boolean createCustomer(CustomerEntity customerEntity);
	
}
