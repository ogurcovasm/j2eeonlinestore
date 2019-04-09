package com.example.j2eeonline.dao;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.util.Assert;

import com.example.j2eeonline.commons.dao.GenericJpaDao;
import com.example.j2eeonline.domain.CustomerEntity;

/**
 * Data access object JPA impl interface to work with user entity database operations.
 * 
 * @author Svetlana Ogurcova
 *
 */
public class CustomerJpaDao extends GenericJpaDao<CustomerEntity, Integer> implements CustomerDao{

	public CustomerJpaDao() {
		super(CustomerEntity.class);
	}
	
	/**
	 * Queries database for customer name availability
	 * 
	 * @param name
	 * @return true if available	 * 
	 */
	public boolean checkAvailable(String name) {
		Assert.notNull(name);
		
		Query query = getEntityManager().
				createQuery("select count (*) from " + getPersistentClass().getSimpleName()
						+ " u where u.name = :name").setParameter("name", name);
	
	Long count = (Long) query.getSingleResult();
	
	return count < 1;
		
	}
		
	/**
	 *Queries customer by name
	 * 
	 * @param name
	 * @return User entity
	 */
	public CustomerEntity loadByCustomerName(String name) {
		Assert.notNull(name);
		
		CustomerEntity customer = null;
		
		Query query = getEntityManager()
				.createQuery("select u from " + getPersistentClass().getSimpleName()
						+ " u where u.name = :name").setParameter("name", name);
		
		try {customer = (CustomerEntity) query.getSingleResult();
		
		} catch (NoResultException e) {
			
		}
		
		return customer;
	}

}
