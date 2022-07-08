package com.hafizmaulana.devtest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_customer")
public class CustomerEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ;
	
	private String name ;
	private String phone ;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}

	
	
	
}
