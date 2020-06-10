package com.care.di_test;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config = "classpath:applicationST.xml";
		GenericXmlApplicationContext gtx = new GenericXmlApplicationContext(config);
		PrintBean pb = gtx.getBean("PrintBean",PrintBean.class);
		pb.printPring(pb.getPrint());
	}
}
