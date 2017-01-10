package myproject;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public interface CityDAO {
	ArrayList<City> getCities();
	void insertCity(City city);
	void updateCity(int population);
	void deleteCity(String name);
}
