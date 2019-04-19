package com.example.j2eeonline.dao;

import com.example.j2eeonline.commons.dao.GenericJpaDao;
import com.example.j2eeonline.domain.ProductEntity;

/**
 * Data access object JPA impl interface to work with product entity database operations.
 * 
 * @author Svetlana Ogurcova
 *
 */
public class ProductJpaDao extends GenericJpaDao<ProductEntity, Integer> implements ProductDao {

	public ProductJpaDao() {
		super(ProductEntity.class);
	}
}
