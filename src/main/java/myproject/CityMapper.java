package myproject;

import java.util.ArrayList;

public interface CityMapper {
	ArrayList<City> getCities();
	void insertCity(City city);
	void updateCity(int population);
	void deleteCity(String name);
}
