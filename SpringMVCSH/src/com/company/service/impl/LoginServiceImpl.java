package com.company.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.LoginDao;
import com.company.dao.pojo.Login;
import com.company.service.dto.vo.User;
import com.company.service.iservice.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDao loginDao;
	

	@Transactional
	@Override
	public String login(Login login) {
		String msg = "error";
		try {
		   	msg = loginDao.login(login);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	
	@Transactional
	@Override
	public String registry(User user) {
		String msg = "error";
		try {
			loginDao.registry(user.getLogin(), user.getDetail());
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

}
