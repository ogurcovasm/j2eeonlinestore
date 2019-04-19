package com.example.j2eeonline.dao;

import java.util.List;

import com.example.j2eeonline.commons.dao.GenericDao;
import com.example.j2eeonline.domain.ProductEntity;

/**
 * Data access object interface to work with Product entity database operations.
 * 
 * @author Svetlana Ogurcova
 *
 */
public interface ProductDao extends GenericDao<ProductEntity, Integer>{

	public List<ProductEntity> findAll();
}
