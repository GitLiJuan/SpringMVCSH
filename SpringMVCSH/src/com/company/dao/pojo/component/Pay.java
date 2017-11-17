package com.company.dao.pojo.component;

public class Pay {
	private double sal;
	private double comm;
	private int holiday;
	public Pay() {
		// TODO Auto-generated constructor stub
	}
	public Pay(double sal, double comm, int holiday) {
		super();
		this.sal = sal;
		this.comm = comm;
		this.holiday = holiday;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public int getHoliday() {
		return holiday;
	}
	public void setHoliday(int holiday) {
		this.holiday = holiday;
	}
	@Override
	public String toString() {
		return "Pay [sal=" + sal + ", comm=" + comm + ", holiday=" + holiday + "]";
	}
	
}
