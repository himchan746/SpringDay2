package com.care.di_test03;

import java.util.ArrayList;

public class PrintClass {
	public void printFuc(String name, ArrayList<String> favoriteFood) {
		System.out.println("이름 : " +name);
		System.out.println("취미 : " +favoriteFood.get(0));
		System.out.println("취미 : " +favoriteFood.get(1));
		System.out.println("취미 : " +favoriteFood.get(2));
	}
}
