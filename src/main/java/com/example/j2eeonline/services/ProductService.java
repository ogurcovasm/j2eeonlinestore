package com.example.j2eeonline.services;

import java.util.List;

import com.example.j2eeonline.domain.ProductEntity;

/**
 * Service providing service methods to work with product data and entity.
 * 
 * @author Svetlana Ogurcova
 *
 */
public interface ProductService {

	/**
	 * Find products by criteria
	 * 
	 * @param criteria the search criteria
	 * @param firstResult
	 * @param sortBy the field to sort by
	 * @param ascending true if the sorting should be in ascending order, false for descending
	 * @return a list of products meeting the criteria
	 */
	public List<ProductEntity> findAll();

}
