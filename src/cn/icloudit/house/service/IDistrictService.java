package cn.icloudit.house.service;

import java.util.List;

import cn.icloudit.house.entity.District;

public interface IDistrictService {
	public List<District> queryAll();
	
	public District queryById(Integer id);
}
