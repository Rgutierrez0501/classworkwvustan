package com.revature.springrestbackend.entity;
/**
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	
	@OneToMany(cascade =CascadeType.ALL)
	private List<Address> address;
	
	@OneToMany(targetEntity=com.revature.springrestbackend.entity.Order.class, cascade=CascadeType.ALL,mappedBy="customer")
	public Set ordersSet;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer id, String name, List<Address> address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public Set getOrdersSet() {
		return ordersSet;
	}

	public void setOrdersSet(Set ordersSet) {
		this.ordersSet = ordersSet;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", ordersSet=" + ordersSet + "]";
	}

	
	
	
	
}**/
