package myproject;


import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyBean bean = (MyBean)ctx.getBean("mybean");
		System.out.println(bean.getMessage());
		
		List<String> Allcities = bean.AllCityData();

		for (String citis: Allcities) {
			System.out.println("City Name : "  + citis);
		}
		
		ctx.destroy();
	}

}
