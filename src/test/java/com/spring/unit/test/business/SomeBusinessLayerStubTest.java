package com.spring.unit.test.business;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.spring.unit.test.data.DataService;

class StubDataService implements DataService {

	@Override
	public int[] fetchAllData() {
		return new int[] {1,2,3,4,5};
	}
	
}

class StubDataServiceWithNoNumbers implements DataService {

	@Override
	public int[] fetchAllData() {
		return new int[] {};
	}
	
}

class StubDataServiceWithOnlyOneNumber implements DataService {

	@Override
	public int[] fetchAllData() {
		return new int[] {1};
	}
	
}
public class SomeBusinessLayerStubTest {

	@Test
	public void calculateSumOfNumbers() {
		SomeBusinessLayer business = new SomeBusinessLayer();
		business.setDataService(new StubDataService());
		int result = business.calculateSumUsingDataService();
		int expectedSum = 15;
		assertEquals(expectedSum, result);
	}
	
	@Test
	public void calculateSumOfNumbersWhenThereAreNoNumbers() {
		SomeBusinessLayer business = new SomeBusinessLayer();
		business.setDataService(new StubDataServiceWithNoNumbers());
		int result = business.calculateSumUsingDataService();
		int expectedSum = 0;
		assertEquals(expectedSum, result);
	}
	
	@Test
	public void calculateSumOfNumbersWhenThereIsOnlyOneNumber() {
		SomeBusinessLayer business = new SomeBusinessLayer();
		business.setDataService(new StubDataServiceWithOnlyOneNumber());
		int result = business.calculateSumUsingDataService();
		int expectedSum = 1;
		assertEquals(expectedSum, result);
	}
}
