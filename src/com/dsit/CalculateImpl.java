package com.dsit;

public class CalculateImpl implements Calcuate {

	public int add(int param1, int param2) {
		return param1 + param2;
	}

	@Override
	public int subtract(int param1, int param2) {
		return param1 - param2;
	}

	@Override
	public int multiply(int param1, int param2) {
		return param1 * param2;
	}

}
