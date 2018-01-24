package com.tactfactory.calculator;

public class Divide {

	protected int value;

	public Divide(int a) {
		this.value = a;
	}

	public void make(int b) {
		if (b == 0) {
			this.value = Integer.MIN_VALUE;
		} else {
			this.value = this.value / b;
		}
	}

	public int getValue() {
		return this.value;
	}
}
