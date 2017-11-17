package com.company.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.company.service.dto.result.DeptInfoReport;
import com.company.service.iservice.ReportService;

@Controller
@RequestMapping("report")
public class ReportAction {
	@Autowired
	ReportService service;
	
	@RequestMapping(value="getReport.do",method=RequestMethod.GET)
	public @ResponseBody List<DeptInfoReport> getInfoReport() {
		return service.reportDeptInfo();
	}
	

}
