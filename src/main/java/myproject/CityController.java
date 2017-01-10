package myproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class CityController {
	@Autowired
	private CityDAOService cityDAOService;
	
	private static final Logger logger = LoggerFactory.getLogger(CityController.class);
	
	@RequestMapping("/citylist")
	public ModelAndView citylist(Locale locale, Model model) {
		
		logger.info("Welcome City List.", locale);
		
		ModelAndView result = new ModelAndView();
		
//		List<City> citylist = new ArrayList<City>();
//		for (int i = 0; i < 3; i ++) {
//			City mycity = new City();
//			
//			mycity.set_Name("Seoul" + i);
//			citylist.add(mycity);
//			
//		}
		
		List<City> citylist = cityDAOService.getCities();
		result.addObject("citylist", citylist);
		
		return result;
	}
}
