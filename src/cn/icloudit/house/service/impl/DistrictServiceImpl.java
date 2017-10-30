package cn.icloudit.house.service.impl;

import java.util.List;

import cn.icloudit.house.dao.IDistrictDAO;
import cn.icloudit.house.entity.District;
import cn.icloudit.house.service.IDistrictService;
import cn.icloudit.house.utils.BeanFactory;

public class DistrictServiceImpl implements IDistrictService {

	private IDistrictDAO districtDao = (IDistrictDAO) BeanFactory
			.getBean("districtDao");

	public List<District> queryAll() {
		return districtDao.queryAll();
	}

	public District queryById(Integer id) {
		return districtDao.queryById(id);
	}

}
