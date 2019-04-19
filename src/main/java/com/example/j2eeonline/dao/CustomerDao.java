package com.example.j2eeonline.dao;

import com.example.j2eeonline.commons.dao.GenericDao;
import com.example.j2eeonline.domain.CustomerEntity;

/**
 * Data access object interface to work with user entity database operations.
 * 
 * @author Svetlana Ogurcova
 *
 */

public interface CustomerDao extends GenericDao<CustomerEntity, Integer> {
	
	/**
	 * Queries database for customer name availability
	 * 
	 * @param name
	 * @return true if available
	 */
	boolean checkAvailable(String name);
	
	/**
	 * Queries customer by customer name
	 * 
	 * @param name
	 * @return Customer entity
	 */
	CustomerEntity loadByCustomerName(String name); 

}
