package com.company.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.EmpDao;
import com.company.dao.pojo.Emp;
import com.company.service.iservice.EmpService;

@Service("empService")
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpDao empDao;

	@Transactional
	@Override
	public String save(Emp t) {
		String msg = "error";
		try {
			empDao.save(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String update(Emp t) {
		String msg = "error";
		try {
			empDao.update(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String delete(Emp t) {
		String msg = "error";
		try {
			empDao.delete(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional(readOnly=true)
	@Override
	public List<Emp> findAll() {
		List<Emp> empList = new ArrayList<Emp>();
		try {
			empList = empDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return empList;
	}

	@Transactional(readOnly=true)
	@Override
	public Emp findById(Integer k) {
		Emp emp = null;
		try {
			emp = empDao.findById(k);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}

	@Transactional(readOnly=true)
	@Override
	public List<Emp> findByName(String ename) {
		List<Emp> empList = new ArrayList<Emp>();
		try {
			empList = empDao.findByName(ename);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return empList;
	}

}
