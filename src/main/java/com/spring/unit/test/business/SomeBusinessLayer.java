package com.spring.unit.test.business;

import java.util.Arrays;

public class SomeBusinessLayer {

	public int calculateSumOf(int[] numbers) {
		return Arrays.stream(numbers).sum();
	}

}
