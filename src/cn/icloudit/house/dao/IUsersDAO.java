package cn.icloudit.house.dao;

import cn.icloudit.house.entity.Users;

public interface IUsersDAO {
	public boolean save(Users user);
	
	public Users queryByPwd(Users user);
	
}
