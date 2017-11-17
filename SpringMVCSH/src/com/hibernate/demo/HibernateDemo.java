package com.hibernate.demo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.company.dao.pojo.Login;

public class HibernateDemo {
	public static void main(String[] args) {

		// 1-将hibernate.cfg.xml文档读入config对象
		Configuration config = new Configuration().configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties())
				.buildServiceRegistry();
		// 2-获取SessionFactory连接池
		SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);

		// 3- 获取连接对象Session（CRUD）
		Session session = sessionFactory.openSession();

		// 4- 启动事务
		Transaction trans = session.beginTransaction();

		// 5-业务逻辑
		// Login login = null;
		// for(int i=1;i<=100;i++){
		// login = new Login("user"+i,"pwd"+i,i%2==0?1:0);
		// session.save(login);
		// }

		// Login login = (Login) session.get(Login.class, 3);
		// System.out.println(login);//findById
		//
		// login.setUsername("SCOTT");
		// login.setPassword("tiger");
		// System.out.println(login);//修改

		// Login login = new Login();
		// login.setLoginId(100);
		// session.delete(login);//删除
//
//		// Hibernate创造出了一套HQL语句，针对POJO对象进行查询
//		Query query = session.createQuery("from Login");
//		@SuppressWarnings("unchecked")
//		List<Login> loginList = query.list();
//		for (Login login : loginList) {
//			System.out.println(login);
//		}
		
//		Query query = session.createQuery("from Login l where l.username like ?");
//		query.setParameter(0, "%3%");
//		@SuppressWarnings("unchecked")
//		List<Login> loginList = query.list();
//		for (Login login : loginList) {
//			System.out.println(login);
//		}
		
		
		Query query = session.createQuery("from Login");
		@SuppressWarnings("unchecked")
		List<Login> loginList = query.setFirstResult(50).setMaxResults(10).list();
		for (Login login : loginList) {
			System.out.println(login);
		}

		// 6-提交事务
		trans.commit();
		// 7-关闭session相关资源
		session.close();
		sessionFactory.close();
	}

}
