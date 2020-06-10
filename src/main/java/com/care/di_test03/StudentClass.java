package com.care.di_test03;

import java.util.ArrayList;

public class StudentClass implements Student{
	private String name;
	private ArrayList<String> favoriteFood;
	private PrintClass pc;
	
	public StudentClass() {}
	public StudentClass(String name) {
		this.name = name;
	}
	@Override
	public void execute() {
		pc.printFuc(name, favoriteFood);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(ArrayList<String> favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	public PrintClass getPc() {
		return pc;
	}

	public void setPc(PrintClass pc) {
		this.pc = pc;
	}
}
