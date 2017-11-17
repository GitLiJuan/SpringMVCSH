package com.company.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.dao.pojo.Login;
import com.company.service.dto.vo.User;
import com.company.service.iservice.LoginService;

@Controller("userAction")
@RequestMapping("user")
public class UserAction  {

	@Autowired
	private LoginService loginService;

	// 2-处理
	@RequestMapping(value="user_login.do",method=RequestMethod.POST)
	public String login(Login login) {
		String msg = loginService.login(login);
		if ("success".equals(msg)) {
			return "redirect:/emp/emps.do";
		}
		return "error";
	}

	@RequestMapping(value="user_registry.do",method=RequestMethod.POST)
	public String registry(User user) {
		return "success".equals(loginService.registry(user))?"redirect:/index.jsp":"error";

	}

}
