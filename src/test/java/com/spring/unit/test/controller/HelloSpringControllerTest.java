package com.spring.unit.test.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloSpringController.class)
public class HelloSpringControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void shouldReturnHelloSpringWhenHelloSpringEndpointIsAccessed() throws Exception {
		
		RequestBuilder request = MockMvcRequestBuilders.get("/hello-spring")
				.accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(request).andReturn();
		
		assertEquals("Hello Spring", result.getResponse().getContentAsString());
	}
}
