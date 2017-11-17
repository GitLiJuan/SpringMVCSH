package com.company.dao.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.ReportDao;
import com.company.service.dto.result.AvgSalByYear;
import com.company.service.dto.result.DeptInfoReport;

@Repository("reportDao")
public class ReportDaoImpl implements ReportDao {

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<DeptInfoReport> reportDeptInfo() throws Exception {

		Session session = sessionFactory.getCurrentSession();
		String sql = "select " + "d.dname,d.loc,g.minSal,g.maxSal,g.avgSal,g.counter,g.sumSal"
				+ " from a_dept d,(select deptno,max(sal) maxSal,min(sal) minSal,avg(sal) avgSal,"
				+ "count(*) counter,sum(sal) sumSal "
				+ "from a_emp group by deptno) g " + "where d.deptno=g.deptno";

		SQLQuery query = session.createSQLQuery(sql);
		query.addScalar("dname");
		query.addScalar("loc");
		query.addScalar("maxSal");
		query.addScalar("minSal");
		query.addScalar("avgSal");
		query.addScalar("counter");
		query.addScalar("sumSal");
		query.setResultTransformer(Transformers.aliasToBean(DeptInfoReport.class));
		List<DeptInfoReport> reportList = (List<DeptInfoReport>) query.list();
		return reportList;
	}

	@Override
	public List<AvgSalByYear> reportAvgSalByYear() throws Exception {
		return null;
	}

}
