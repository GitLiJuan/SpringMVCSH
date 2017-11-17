package com.company.service.iservice;

import java.util.List;

import com.company.service.dto.result.DeptInfoReport;

public interface ReportService {
	List<DeptInfoReport> reportDeptInfo();//前后端分离的情况下，返回的是json字符串
	String reportAvgSalByYear();
}
