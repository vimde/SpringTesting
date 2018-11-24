package com.mockito.tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

public class MockitoArgumentCaptor {

	@Test
	public void captureArgumentPassedToAMethod() {
		List list = Mockito.mock(List.class);
		list.add("Argument Captor");
		ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
		verify(list).add(argumentCaptor.capture());
		assertEquals("Argument Captor", argumentCaptor.getValue());
	}
	
	@Test
	public void captureMultipleArguments() {
		List list = Mockito.mock(List.class);
		list.add("Argument");
		list.add("Captor");
		ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
		verify(list, times(2)).add(argumentCaptor.capture());
		List<String> values = argumentCaptor.getAllValues();
		assertEquals("Argument", values.get(0));
		assertEquals("Captor", values.get(1));
	}
}
