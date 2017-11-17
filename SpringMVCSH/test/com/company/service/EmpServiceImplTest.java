package com.company.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.dao.pojo.Emp;
import com.company.service.iservice.EmpService;

public class EmpServiceImplTest {
	ApplicationContext ctx;
	EmpService empService;
	@Before
	public void setUp(){
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		empService = (EmpService) ctx.getBean("empService");
	}
	@After
	public void tearDown(){
		ctx = null;
	}
	@Test
	public void testSave() throws Exception {
		Emp emp = new Emp("CCC", "bbb", 2, new Date(), 4000, 500.0, 1);
		String msg = empService.save(emp);
		System.out.println(msg);
		testFindAll();
	}

	@Test
	public void testUpdate() throws Exception {
		Emp emp = empService.findById(12);
		System.out.println("origin:" + emp);
		emp.setEname("SSSSS");
		emp.setSal(6000);
		String msg = empService.update(emp);
		System.out.println(msg);
		testFindAll();
	}

	@Test
	public void testDelete() throws Exception {
		Emp emp = empService.findById(11);
		if (emp != null) {
			String msg = empService.delete(emp);
			System.out.println(msg);
		}
	}

	@Test
	public void testFindAll() throws Exception {
		List<Emp> emps = new ArrayList<>();
		emps = empService.findAll();
		for (Emp emp : emps)
			System.out.println(emp);
	}

	@Test
	public void testFindById() throws Exception {
		Emp emp = empService.findById(6);
		System.out.println(emp);
	}

	@Test
	public void testFindByName() throws Exception {
		List<Emp> emps = new ArrayList<>();
		emps = empService.findByName("a");
		for (Emp e : emps) {
			System.out.println(e);
		}
	}

}
