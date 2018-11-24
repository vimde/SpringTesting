package com.spring.unit.test.business;

import java.util.Arrays;

import com.spring.unit.test.data.DataService;

public class SomeBusinessLayer {

	private DataService dataService;

	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}

	public int calculateSumOf(int[] numbers) {
		return Arrays.stream(numbers).sum();
	}

	public int calculateSumUsingDataService() {
		int[] numbers = dataService.fetchAllData();
		return Arrays.stream(numbers).sum();
	}

}
