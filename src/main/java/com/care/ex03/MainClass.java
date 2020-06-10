package com.care.ex03;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config = "classpath:app-config4.xml";
		GenericXmlApplicationContext gtx = new GenericXmlApplicationContext(config);
		SaveClass sc = gtx.getBean("save",SaveClass.class);
//		ArrayList<String> hobby = new ArrayList<String>();
//		HashMap<String, String> weather = new HashMap<String, String>();
//		hobby.add("게임");hobby.add("웹툰");
//		weather.put("오늘", "더워더워");
//		weather.put("내일", "시원하자");
//		sc.setName("찬찬"); sc.setHobby(hobby);
//		sc.setWeather(weather);
		sc.pcFunc();
		SaveClass sc01 = gtx.getBean("save01",SaveClass.class);
		sc01.pcFunc();
	}
}
