package cn.icloudit.house.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import cn.icloudit.house.dao.IUsersDAO;
import cn.icloudit.house.entity.Users;
import cn.icloudit.house.utils.HibernateSessionFactory;

public class UsersDAOImpl implements IUsersDAO {

	public Users queryByPwd(Users user) {
		Session session = HibernateSessionFactory.getSession();
		String hql = "FROM Users u WHERE u.name=? AND u.password=?";
		Query query = session.createQuery(hql);
		query.setString(0,user.getName());
		query.setString(1, user.getPassword());
		Object o = query.uniqueResult();
		user = (Users) o;
		return user; 
	}

	public boolean save(Users user) {
		Session session = HibernateSessionFactory.getSession();
		boolean isSuccess = true;
		try {
			session.save(user);
		} catch (HibernateException e) {
			isSuccess = false;
			e.printStackTrace();
		}
		return isSuccess;
	}

}
