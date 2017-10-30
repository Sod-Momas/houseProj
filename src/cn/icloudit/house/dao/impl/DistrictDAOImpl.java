package cn.icloudit.house.dao.impl;

import java.util.List;

import org.hibernate.Session;

import cn.icloudit.house.dao.IDistrictDAO;
import cn.icloudit.house.entity.District;
import cn.icloudit.house.utils.HibernateSessionFactory;

public class DistrictDAOImpl implements IDistrictDAO {

	@SuppressWarnings("unchecked")
	public List<District> queryAll() {
		Session session = HibernateSessionFactory.getSession();
		return session.createQuery("FROM District").list();
	}

	public District queryById(Integer id) {
		Session session = HibernateSessionFactory.getSession();
		return (District) session.createQuery("FROM District d WHERE d.id=?")
				.setInteger(0, id).uniqueResult();
	}

}
