package myproject;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CityDAOService implements CityDAO {
	@Autowired
	private SqlSession sqlSession;
	
	public ArrayList<City> getCities() {
		ArrayList<City> result = new ArrayList<City>();
//		CityMapper citymapper = sqlSession.getMapper(CityMapper.class);
//		result = citymapper.getCities();
		return result;
	}
	
	public void insertCity(City city) {
		
	}
	
	public void updateCity(int population) {
		
	}
	
	public void deleteCity(String name) {
		
	}

}
