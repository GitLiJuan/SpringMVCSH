package com.company.service;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.service.iservice.ReportService;

public class ReportServiceImplTest {
	
	ApplicationContext ctx;
	ReportService reportService;
	@Before
	public void setUp(){
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		reportService = (ReportService) ctx.getBean("reportService");
	}
	@After
	public void tearDown(){
		ctx = null;
	}

	@Test
	public void testReportDeptInfo() {
		//String reportJsonStr = reportService.reportDeptInfo();
		//System.out.println(reportJsonStr);
	}

	@Test
	public void testReportAvgSalByYear() {
		fail("Not yet implemented");
	}

}
