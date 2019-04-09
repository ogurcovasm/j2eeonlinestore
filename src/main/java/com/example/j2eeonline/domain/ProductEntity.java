package com.example.j2eeonline.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.j2eeonline.commons.domain.BaseEntity;

/**
 * Entity to hold product data - name, price, etc.
 * 
 * @author Svetlana Ogurcova
 *
 */
@Entity
@Table(name="product")
public class ProductEntity extends BaseEntity {
	private static final long serialVersionUID = 6393434243377726576L;	
	private String name;	
	private BigDecimal price;	
	private String description;	
	private Date lastUpdate;	
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(precision = 6, scale = 2)
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
}
