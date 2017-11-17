package com.company.service.iservice;

import java.util.List;

import com.company.dao.pojo.Emp;

public interface EmpService extends BaseService<Emp,Integer> {
		List<Emp> findByName(String ename);
}
