package com.care.ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SubClass {
	public void subFunc() {
		String config = "classpath:applicationCAR.xml";
		GenericXmlApplicationContext gtx = new GenericXmlApplicationContext(config);
		Car car = gtx.getBean("car", Car.class);
		
		// Car car = new Controller01();
		System.out.println("===서브 클래스가 속력을 냅니다.===");
		car.speed();
	}
}
