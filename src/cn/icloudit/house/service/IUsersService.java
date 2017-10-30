package cn.icloudit.house.service;

import cn.icloudit.house.entity.Users;

public interface IUsersService {
	public boolean register(Users user);

	public Users login(Users user);
}
