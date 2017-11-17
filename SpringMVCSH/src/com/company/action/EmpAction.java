package com.company.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.company.dao.pojo.Emp;
import com.company.service.iservice.EmpService;
import com.opensymphony.xwork2.ModelDriven;

@Controller("empAction")
@RequestMapping("emp")
public class EmpAction {

	@Autowired
	private EmpService empService;
	@RequestMapping(value="save.do",method=RequestMethod.POST)
	public String save(Emp emp) {
		String msg=empService.save(emp);
		if(("success").equals(msg)){
			return "redirect:/emp/emps.do";
		}
		return msg;
	}
	@RequestMapping(value="delete.do",method=RequestMethod.GET)
	public String delete(int empno) {
		Emp emp=empService.findById(empno);
		String msg=empService.delete(emp);
		if(("success").equals(msg)){
			return "redirect:/emp/emps.do";
		}
		return msg;
	}
	@RequestMapping(value="update.do",method=RequestMethod.POST)
	public String update(Emp emp) {
		String msg=empService.update(emp);
		if(("success").equals(msg)){
			return "redirect:/emp/emps.do";
		}
		return msg;
	}

	@RequestMapping(value="emps.do",method=RequestMethod.GET)
	public String findAll(Map<String,Object> map) {
		String msg = "error";
		List<Emp> empList = empService.findAll();
		if (empList != null && empList.size() > 0) {
			map.put("empListFromServer", empList);
			msg = "emp_details";
		}
		return msg;
	}
	@RequestMapping(value="emp_findById.do",method=RequestMethod.GET)
	public String findById(int empno,String type,Map<String,Object> map) {
		String msg = "error";
		 Emp emp = empService.findById(empno);
		if (emp != null) {
			if("update".equals(type)){
				map.put("emp", emp);
				return "emp_update";
			}else{
			List<Emp> empList = new ArrayList<Emp>();
			empList.add(emp);
			map.put("empListFromServer", empList);
			msg = "emp_details";
			}
		}
		return msg;
	}
	
	@RequestMapping(value="emp_findByName.do",method=RequestMethod.POST)
	public String findByName(String ename,Map<String,Object> map) {
		String msg = "error";
		List<Emp> empList = empService.findByName(ename);
		if (empList != null && empList.size() > 0) {
			map.put("empListFromServer", empList);
			msg = "emp_details";
		}
		return msg;
	}
}
