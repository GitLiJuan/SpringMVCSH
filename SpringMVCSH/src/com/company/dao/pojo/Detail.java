package com.company.dao.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Detail implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int detailId;
	private String realname;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	private double balance;

	public Detail() {
		// TODO Auto-generated constructor stub
	}

	public Detail(int detailId, String realname, Date birthday, double balance) {
		super();
		this.detailId = detailId;
		this.realname = realname;
		this.birthday = birthday;
		this.balance = balance;
	}

	public Detail(String realname, Date birthday, double balance) {
		super();
		this.realname = realname;
		this.birthday = birthday;
		this.balance = balance;
	}

	public int getDetailId() {
		return detailId;
	}

	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Detail [detailId=" + detailId + ", realname=" + realname + ", birthday=" + birthday + ", balance="
				+ balance + "]";
	}

}
