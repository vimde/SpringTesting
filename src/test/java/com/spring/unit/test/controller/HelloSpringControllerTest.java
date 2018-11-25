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
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloSpringController.class)
public class HelloSpringControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void shouldReturnHelloSpringWhenHelloSpringEndpointIsAccessed() throws Exception {
		
		// Build the request with the endpoint and the content-type that is expected/accepted
		RequestBuilder request = MockMvcRequestBuilders.get("/hello-spring")
				.accept(MediaType.APPLICATION_JSON);
		
		// Call the endpoint with the request and return the result
		MvcResult result = mockMvc.perform(request).andReturn();
		
		// Assert that the result matches with the expected result
		assertEquals("Hello Spring", result.getResponse().getContentAsString());
	}
	
	@Test
	public void shouldReturnHelloSpringWithExpectedContentAndStatusWhenHelloSpringEndpointIsAccessed() 
			throws Exception {
		
		// Build the request with the endpoint and the content-type that is expected/accepted
		RequestBuilder request = MockMvcRequestBuilders.get("/hello-spring")
				.accept(MediaType.APPLICATION_JSON);
		
		// Call the endpoint with the request and added the expectations before returning the result
		mockMvc.perform(request)
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Hello Spring"))
				.andReturn();
		
		// Assert is not required in this case since we have already added the expectations above
		//assertEquals("Hello Spring", result.getResponse().getContentAsString());
	}
}
