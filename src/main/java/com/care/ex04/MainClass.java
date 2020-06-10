package com.care.ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// Car car = new Controller01();
		String config = "classpath:applicationCAR.xml";
		GenericXmlApplicationContext gtx = new GenericXmlApplicationContext(config);
		Car car = gtx.getBean("car", Car.class);
		System.out.println("메인 클래스가 속력을 냅니다.");
		car.speed();
		SubClass sc = new SubClass();
		sc.subFunc();
	}

}
