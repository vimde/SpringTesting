package com.spring.unit.test.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

import com.spring.unit.test.data.DataService;


public class SomeBusinessLayerMockTest {

	@Test
	public void calculateSumOfNumbers() {
		SomeBusinessLayer business = new SomeBusinessLayer();
		DataService dataService = Mockito.mock(DataService.class);
		when(dataService.fetchAllData()).thenReturn(new int[] {1,2,3,4,5});
		business.setDataService(dataService);
		int result = business.calculateSumUsingDataService();
		int expectedSum = 15;
		assertEquals(expectedSum, result);
	}
	
	@Test
	public void calculateSumOfNumbersWhenThereAreNoNumbers() {
		SomeBusinessLayer business = new SomeBusinessLayer();
		DataService dataService = Mockito.mock(DataService.class);
		when(dataService.fetchAllData()).thenReturn(new int[] {});
		business.setDataService(dataService);
		int result = business.calculateSumUsingDataService();
		int expectedSum = 0;
		assertEquals(expectedSum, result);
	}
	
	@Test
	public void calculateSumOfNumbersWhenThereIsOnlyOneNumber() {
		SomeBusinessLayer business = new SomeBusinessLayer();
		DataService dataService = Mockito.mock(DataService.class);
		when(dataService.fetchAllData()).thenReturn(new int[] {1});
		business.setDataService(dataService);
		int result = business.calculateSumUsingDataService();
		int expectedSum = 1;
		assertEquals(expectedSum, result);
	}
}
