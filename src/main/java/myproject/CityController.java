package myproject;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class CityController {
	private static final Logger logger = LoggerFactory.getLogger(CityController.class);
	
	@RequestMapping("/citylist")
	public ModelAndView citylist(Locale locale, Model model) {
		logger.info("Welcome City List.", locale);
		
		ModelAndView result = new ModelAndView();
		
		List<City> citylist = null;
		
		City mycity = new City();
		mycity.set_Name("Seoul");
		citylist.add(mycity);
		mycity.set_Name("Busan");
		citylist.add(mycity);
		mycity.set_Name("Daegu");
		citylist.add(mycity);

		result.setMdoelName("citylist");
		return result;
	}
}
