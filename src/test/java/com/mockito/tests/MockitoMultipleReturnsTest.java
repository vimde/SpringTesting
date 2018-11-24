package com.mockito.tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class MockitoMultipleReturnsTest {

	private List list = Mockito.mock(List.class);

	@Test
	public void returnMultipleValues() {
		when(list.size()).thenReturn(5).thenReturn(10);
		assertEquals(5, list.size());
		assertEquals(10, list.size());
	}

	@Test
	public void returnWithParametersToTheMethod() {
		when(list.get(0)).thenReturn("Hello").thenReturn("World");
		assertEquals("Hello", list.get(0));
		assertEquals("World", list.get(0));
	}
}
