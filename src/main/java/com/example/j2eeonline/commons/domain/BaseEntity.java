package com.example.j2eeonline.commons.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Base entity type to hold common Id property. To be extended.
 * 
 * @author Svetlana Ogurcova
 *
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = -7835486936916022773L;

	@Id
	@GeneratedValue
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
