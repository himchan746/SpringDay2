package com.care.di_test03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String config = "classpath:application_test03.xml";
		GenericXmlApplicationContext gtx = new GenericXmlApplicationContext(config);
		Student student = gtx.getBean("student",StudentClass.class);
		student.execute();
	}
}
