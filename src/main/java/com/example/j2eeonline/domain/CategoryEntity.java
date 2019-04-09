package com.example.j2eeonline.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.j2eeonline.commons.domain.BaseEntity;

@Entity 
@Table(name="category")
public class CategoryEntity extends BaseEntity {	
	private static final long serialVersionUID = 5481417579729925033L;		
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
