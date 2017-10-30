package cn.icloudit.house.dao.impl;

import java.util.List;

import org.hibernate.Session;

import cn.icloudit.house.dao.ITypesDAO;
import cn.icloudit.house.entity.Types;
import cn.icloudit.house.utils.HibernateSessionFactory;

public class TypesDAOImpl implements ITypesDAO {

	@SuppressWarnings("unchecked")
	public List<Types> queryAll() {
		Session session = HibernateSessionFactory.getSession();
		return session.createQuery("FROM Types").list();
	}

}
