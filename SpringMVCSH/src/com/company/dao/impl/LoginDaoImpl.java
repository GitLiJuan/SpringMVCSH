package com.company.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.LoginDao;
import com.company.dao.pojo.Detail;
import com.company.dao.pojo.Login;

@Repository("loginDao")
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Login t) throws Exception {
		sessionFactory.getCurrentSession().save(t);
	}

	@Override
	public void update(Login t) throws Exception {
		sessionFactory.getCurrentSession().update(t);
	}

	@Override
	public void delete(Login t) throws Exception {
		sessionFactory.getCurrentSession().delete(t);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Login> findAll() throws Exception {
		return sessionFactory.getCurrentSession()
				.createQuery("from Login")
				.list();
	}

	@Override
	public Login findById(Integer k) throws Exception {
		return (Login) sessionFactory.getCurrentSession().get(Login.class, k);
	}

	@Override
	public String login(Login login) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Object obj = session.createQuery("from Login log where log.username=? and log.password=?")
				.setParameter(0, login.getUsername())
				.setParameter(1, login.getPassword())
				.uniqueResult();
		return obj == null ? "error" : "success";
	}

	@Override
	public void registry(Login login, Detail detail) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.save(login);
		session.save(detail);
	}

}
