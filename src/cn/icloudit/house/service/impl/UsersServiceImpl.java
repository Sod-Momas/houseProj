package cn.icloudit.house.service.impl;

import org.hibernate.HibernateException;

import cn.icloudit.house.dao.IUsersDAO;
import cn.icloudit.house.entity.Users;
import cn.icloudit.house.service.IUsersService;
import cn.icloudit.house.utils.BeanFactory;

public class UsersServiceImpl implements IUsersService {
	private IUsersDAO userDao = (IUsersDAO) BeanFactory.getBean("usersDao");

	public Users login(Users user) {
		try {
			user = userDao.queryByPwd(user);
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
		}

		return user;
	}

	public boolean register(Users user) {
		boolean isSuccess = false;
		try {
			isSuccess = userDao.save(user);
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
		}
		return isSuccess;
	}

}
