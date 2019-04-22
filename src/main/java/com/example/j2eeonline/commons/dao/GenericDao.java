package com.example.j2eeonline.commons.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Generic interface for Data Access Objects. To be extended or implemented.
 * Contains commons persistence methods.
 * 
 * @author Svetlana Ogurcova
 *
 */
public interface GenericDao<T, ID extends Serializable> {

	T save(T entity);
	T update(T entity);
	void delete(T entity);
	T findById(ID id);
	List<T> findAll();
	List<T> filterByCategoryId(Integer categoryId);
	void flush();	
}
