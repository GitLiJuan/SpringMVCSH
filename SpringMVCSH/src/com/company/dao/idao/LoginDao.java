package com.company.dao.idao;

import com.company.dao.pojo.Detail;
import com.company.dao.pojo.Login;

public interface LoginDao extends BaseDao<Login, Integer> {
	
	String login(Login login) throws Exception;

	void registry(Login login, Detail detail) throws Exception;

}
