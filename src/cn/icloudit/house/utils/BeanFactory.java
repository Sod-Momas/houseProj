package cn.icloudit.house.utils;

import java.util.HashMap;
import java.util.Map;

import cn.icloudit.house.dao.impl.DistrictDAOImpl;
import cn.icloudit.house.dao.impl.HouseDAOImpl;
import cn.icloudit.house.dao.impl.TypesDAOImpl;
import cn.icloudit.house.dao.impl.UsersDAOImpl;
import cn.icloudit.house.service.impl.DistrictServiceImpl;
import cn.icloudit.house.service.impl.HouseServiceImpl;
import cn.icloudit.house.service.impl.TypesServiceImpl;
import cn.icloudit.house.service.impl.UsersServiceImpl;

public class BeanFactory {
	private static Map<String,Object> beans =new HashMap<String, Object>();
	
	static{
		beans.put("usersDao",new UsersDAOImpl());
		beans.put("usersService",new UsersServiceImpl());
		beans.put("houseDao", new HouseDAOImpl());
		beans.put("houseService", new HouseServiceImpl());
		beans.put("typesDao", new TypesDAOImpl());
		beans.put("typesService", new TypesServiceImpl());
		beans.put("districtDao", new DistrictDAOImpl());
		beans.put("districtService", new DistrictServiceImpl());
	}
	public static Object getBean(String key){
		return beans.get(key);
	}
}
