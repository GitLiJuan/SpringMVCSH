package com.company.dao.idao;

import java.util.List;

import com.company.dao.pojo.Emp;

public interface EmpDao extends BaseDao<Emp, Integer> {
	List<Emp> findByName(String ename) throws Exception;
}
