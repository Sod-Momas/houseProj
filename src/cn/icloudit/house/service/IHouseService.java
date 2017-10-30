package cn.icloudit.house.service;

import cn.icloudit.house.entity.House;
import cn.icloudit.house.entity.Qb;
import cn.icloudit.house.utils.Pager;

public interface IHouseService {
	public Pager<House> queryAllByPager(Pager<House> pager);

	public boolean addHouse(House house);

	public Pager<House> queryAllByTjPager(Pager<House> pager, Qb qb);
}
