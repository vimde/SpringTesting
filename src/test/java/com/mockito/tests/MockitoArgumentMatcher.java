package com.mockito.tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class MockitoArgumentMatcher {

	@Test
	public void testWithArgumentMatchers() {
		List list = mock(List.class);
		when(list.get(Mockito.anyInt())).thenReturn("Hello Argument Matcher");
		assertEquals("Hello Argument Matcher", list.get(0));
		assertEquals("Hello Argument Matcher", list.get(10));
	}
}
