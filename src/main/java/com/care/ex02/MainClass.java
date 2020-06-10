package com.care.ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		STBean stb = new STBean();
		String config = "classpath:applicationST.xml";
		GenericXmlApplicationContext gtx = new GenericXmlApplicationContext(config);
		STBean stb = gtx.getBean("stb", STBean.class);
//		stb.setName("홍길동111"); property name="name" value = "김말이"
//		stb.setAge(2011); property name="age" value ="1234";
		stb.namePrint(stb.getName());
		stb.agePrint(stb.getAge());
	}
}
