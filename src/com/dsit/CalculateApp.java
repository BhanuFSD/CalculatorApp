package com.dsit;

public class CalculateApp {
	public static void main(String[] args) {
		CalculateImpl cal = new CalculateImpl();
		System.out.println(cal.add(1, 3));
		System.out.println(cal.subtract(2, 1));		
	}
}
