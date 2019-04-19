package com.example.j2eeonline.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.j2eeonline.commons.domain.BaseEntity;

/**
 * Entity to hold customer data - cc_number, address, etc.
 * 
 * @author Svetlana Ogurcova
 *
 */
@Entity
@Table(name="customer")
public class CustomerEntity extends BaseEntity {
	private static final long serialVersionUID = 8664999672056946158L;
	private String name;
	private String email;
	private String phone;
	private String address;
	private String cc_Number;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCc_Number() {
		return cc_Number;
	}

	public void setCc_Number(String cc_Number) {
		this.cc_Number = cc_Number;
	}
}
