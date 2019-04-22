package com.example.j2eeonline.services.impl;

import java.util.List;

import com.example.j2eeonline.dao.ProductDao;
import com.example.j2eeonline.domain.ProductEntity;
import com.example.j2eeonline.services.ProductService;

public class ProductServiceImpl implements ProductService {
	
	private List<ProductEntity> products;
	
	private List<ProductEntity> filteredProducts;
	
	private ProductDao productDao;
		
	public List<ProductEntity> findAll() {
		this.products = productDao.findAll();
		return products;
	}
	
	public List<ProductEntity> filterByCategoryId(Integer categoryId) {
		this.filteredProducts = productDao.filterByCategoryId(categoryId);
		return filteredProducts;
	}

	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
}
