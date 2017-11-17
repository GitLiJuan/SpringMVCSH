package com.company.dao.idao;

import java.util.List;

import com.company.service.dto.result.AvgSalByYear;
import com.company.service.dto.result.DeptInfoReport;

public interface ReportDao {
	List<DeptInfoReport> reportDeptInfo() throws Exception;

	List<AvgSalByYear> reportAvgSalByYear() throws Exception;
}
