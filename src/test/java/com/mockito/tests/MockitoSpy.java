package com.mockito.tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Test;
import org.mockito.Mockito;

/*
 * Spy 
 * some use cases: 
 * 1. when you don't have access to a particular class but you would like to know
 * the methods that are called under the hood
 * 2. when you want to retain the behavior, in case of mock, it will not retain the behavior,
 * it will just return what you ask it to whereas in case of spy the real one is used and the
 * state is retained unless you explicitly ask the spy to return something
 */
public class MockitoSpy {

	@Test
	public void spying() {
		ArrayList arrayListSpy = Mockito.spy(ArrayList.class);
		arrayListSpy.add("Spy");
		assertEquals(1, arrayListSpy.size());
		arrayListSpy.add("Second");
		arrayListSpy.add("Third");
		assertEquals(3, arrayListSpy.size());
		when(arrayListSpy.size()).thenReturn(5);
		assertEquals(5, arrayListSpy.size());
		arrayListSpy.add(10);
		assertEquals(5, arrayListSpy.size());
	}
}
