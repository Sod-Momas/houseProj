package cn.icloudit.house.dao;

import cn.icloudit.house.entity.House;
import cn.icloudit.house.entity.Qb;
import cn.icloudit.house.utils.Pager;

public interface IHouseDAO {
	public Pager<House> queryAll(Pager<House> pager);

	public boolean addHouse(House house);

	public Pager<House> queryAllByTjPager(Pager<House> pager, Qb qb);
	
}
