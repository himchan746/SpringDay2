package com.care.di_test02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class mainClass {
	/*두 수를 연산하는 사칙계산기를 만드시오.*/
	public static void main(String[] args) {
		String config = "classpath:application_test02.xml";
		GenericXmlApplicationContext gtx = new GenericXmlApplicationContext(config);
		saveClass save = gtx.getBean("save",saveClass.class);
		OperationClass oper = gtx.getBean("oper",OperationClass.class);
		System.out.println(oper.getName());
		save.operationClass();
		save.printClass();
	}
}
