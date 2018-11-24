package com.spring.unit.test.business;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBusinessLayerTest {

	@Test
	public void calculateSumOfNumbers() {
		SomeBusinessLayer business = new SomeBusinessLayer();
		int result = business.calculateSumOf(new int[] {1,2,3,4,5});
		int expectedSum = 15;
		assertEquals(expectedSum, result);
	}
	
	@Test
	public void calculateSumOfNumbersWhenThereAreNoNumbers() {
		SomeBusinessLayer business = new SomeBusinessLayer();
		int result = business.calculateSumOf(new int[] {});
		int expectedSum = 0;
		assertEquals(expectedSum, result);
	}
	
	@Test
	public void calculateSumOfNumbersWhenThereIsOnlyOneNumber() {
		SomeBusinessLayer business = new SomeBusinessLayer();
		int result = business.calculateSumOf(new int[] {1});
		int expectedSum = 1;
		assertEquals(expectedSum, result);
	}
}
