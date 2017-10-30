package cn.icloudit.house.service.impl;

import java.util.List;

import cn.icloudit.house.dao.ITypesDAO;
import cn.icloudit.house.entity.Types;
import cn.icloudit.house.service.ITypesService;
import cn.icloudit.house.utils.BeanFactory;

public class TypesServiceImpl implements ITypesService{

	private ITypesDAO typesDao = (ITypesDAO) BeanFactory.getBean("typesDao");
	
	public List<Types> queryAll() {
		return typesDao.queryAll();
	}

}
