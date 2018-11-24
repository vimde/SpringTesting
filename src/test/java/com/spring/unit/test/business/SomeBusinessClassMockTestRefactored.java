package com.spring.unit.test.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.spring.unit.test.data.DataService;


@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessClassMockTestRefactored {

	@Mock
	private DataService dataService;
	
	@InjectMocks
	private SomeBusinessClass business;
	
	@Test
	public void calculateSumOfNumbers() {
		when(dataService.fetchAllData()).thenReturn(new int[] {1,2,3,4,5});
		int result = business.calculateSumUsingDataService();
		int expectedSum = 15;
		assertEquals(expectedSum, result);
	}
	
	@Test
	public void calculateSumOfNumbersWhenThereAreNoNumbers() {
		when(dataService.fetchAllData()).thenReturn(new int[] {});
		int result = business.calculateSumUsingDataService();
		int expectedSum = 0;
		assertEquals(expectedSum, result);
	}
	
	@Test
	public void calculateSumOfNumbersWhenThereIsOnlyOneNumber() {
		when(dataService.fetchAllData()).thenReturn(new int[] {1});
		int result = business.calculateSumUsingDataService();
		int expectedSum = 1;
		assertEquals(expectedSum, result);
	}
}
