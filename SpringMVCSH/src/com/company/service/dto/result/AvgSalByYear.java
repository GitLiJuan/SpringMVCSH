package com.company.service.dto.result;

import java.io.Serializable;
import java.util.Date;


public class AvgSalByYear implements Serializable{
	private static final long serialVersionUID = 1L;
	private Date time;
	private double sal;
	public AvgSalByYear() {
	}
	public AvgSalByYear(Date time, double sal) {
		super();
		this.time = time;
		this.sal = sal;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "AvgSalByYear [time=" + time + ", sal=" + sal + "]";
	}
	
	
}
