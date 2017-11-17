package com.company.service.iservice;

import com.company.dao.pojo.Login;
import com.company.service.dto.vo.User;

/**
 * 
 * @author Administrator
 * 登录注册服务接口
 */
public interface LoginService {
	/**
	 * 
	 * @param login 封装了username，password
	 * @return  “success”，“error”
	 */
		String login(Login login);
		/**
		 * 
		 * @param user  封装了login表和detail表的注册信息  面向V层封装信息
	 * @return  “success”，“error”
		 */
		String registry(User user);
		
}
