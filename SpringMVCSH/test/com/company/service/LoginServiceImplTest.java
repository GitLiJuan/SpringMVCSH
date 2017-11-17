package com.company.service;

import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.dao.pojo.Detail;
import com.company.dao.pojo.Login;
import com.company.service.dto.vo.User;
import com.company.service.iservice.LoginService;

public class LoginServiceImplTest {
	
	ApplicationContext ctx;
	LoginService loginService;
	@Before
	public void setUp(){
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		loginService = (LoginService) ctx.getBean("loginService");
	}
	@After
	public void tearDown(){
		ctx = null;
	}

	@Test
	public void testLogin() {
		Login user1 = new Login("superman","123456");
		String msg = loginService.login(user1);
		System.out.println("login1:"+msg);
		Assert.assertEquals("success", msg);//断言

		Login user2 = new Login("root111","root");
		String msg1 = loginService.login(user2);
		System.out.println("login2:"+msg1);
		Assert.assertEquals("error", msg1);
	
	}

	@Test
	public void testRegistry() {
		Login login = new Login("superman","123456",1);
		Detail detail = new Detail("Struts2",new Date(),80000);
		User user = new User(login,detail);
		loginService.registry(user);
		System.out.println("registry success!");
	}

}
