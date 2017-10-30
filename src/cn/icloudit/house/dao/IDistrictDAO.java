package cn.icloudit.house.dao;

import java.util.List;

import cn.icloudit.house.entity.District;

public interface IDistrictDAO {

	public List<District> queryAll();
	
	public District queryById(Integer id);
	
}
