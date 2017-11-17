package com.company.dao.pojo.component;

import java.io.Serializable;

public class Worker implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private Pay pay;
	public Worker() {
		// TODO Auto-generated constructor stub
	}
	public Worker(String name, Pay pay) {
		super();
		this.name = name;
		this.pay = pay;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Pay getPay() {
		return pay;
	}
	public void setPay(Pay pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return "Worker [id=" + id + ", name=" + name + ", pay=" + pay.toString() + "]";
	}
	
	
}
