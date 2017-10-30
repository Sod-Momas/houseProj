package cn.icloudit.house.service.impl;

import cn.icloudit.house.dao.IHouseDAO;
import cn.icloudit.house.entity.House;
import cn.icloudit.house.entity.Qb;
import cn.icloudit.house.service.IHouseService;
import cn.icloudit.house.utils.BeanFactory;
import cn.icloudit.house.utils.Pager;

public class HouseServiceImpl implements IHouseService {
	private IHouseDAO houseDao = (IHouseDAO) BeanFactory.getBean("houseDao");

	@Override
	public Pager<House> queryAllByPager(Pager<House> pager) {
		return houseDao.queryAll(pager);
	}

	@Override
	public boolean addHouse(House house) {
		return houseDao.addHouse(house);
	}

	@Override
	public Pager<House> queryAllByTjPager(Pager<House> pager, Qb qb) {
		return houseDao.queryAllByTjPager(pager, qb);
	}

}
