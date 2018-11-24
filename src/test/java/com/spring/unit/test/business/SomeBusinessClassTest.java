package com.spring.unit.test.business;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBusinessClassTest {

	@Test
	public void calculateSumOfNumbers() {
		SomeBusinessClass business = new SomeBusinessClass();
		int result = business.calculateSumOf(new int[] {1,2,3,4,5});
		int expectedSum = 15;
		assertEquals(expectedSum, result);
	}
	
	@Test
	public void calculateSumOfNumbersWhenThereAreNoNumbers() {
		SomeBusinessClass business = new SomeBusinessClass();
		int result = business.calculateSumOf(new int[] {});
		int expectedSum = 0;
		assertEquals(expectedSum, result);
	}
	
	@Test
	public void calculateSumOfNumbersWhenThereIsOnlyOneNumber() {
		SomeBusinessClass business = new SomeBusinessClass();
		int result = business.calculateSumOf(new int[] {1});
		int expectedSum = 1;
		assertEquals(expectedSum, result);
	}
}
