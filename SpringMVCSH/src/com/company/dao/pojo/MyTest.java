package com.company.dao.pojo;

import java.io.Serializable;
import java.util.Date;


public class MyTest implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double sal;
	private Date mydate;
	private Date mytime;
	private Date myDateTime;
	private String annualSal;
	
	
	
	public String getAnnualSal() {
		return annualSal;
	}
	public void setAnnualSal(String annualSal) {
		this.annualSal = annualSal;
	}
	public MyTest() {
		// TODO Auto-generated constructor stub
	}
	public MyTest(int id, String name, double sal, Date mydate, Date mytime, Date myDateTime) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.mydate = mydate;
		this.mytime = mytime;
		this.myDateTime = myDateTime;
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
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Date getMydate() {
		return mydate;
	}
	public void setMydate(Date mydate) {
		this.mydate = mydate;
	}
	public Date getMytime() {
		return mytime;
	}
	public void setMytime(Date mytime) {
		this.mytime = mytime;
	}
	public Date getMyDateTime() {
		return myDateTime;
	}
	public void setMyDateTime(Date myDateTime) {
		this.myDateTime = myDateTime;
	}
	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + ", sal=" + sal + ", mydate=" + mydate + ", mytime=" + mytime
				+ ", myDateTime=" + myDateTime + "]";
	}
	
}
