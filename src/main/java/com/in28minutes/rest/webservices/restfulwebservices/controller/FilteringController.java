package com.in28minutes.rest.webservices.restfulwebservices.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.webservices.restfulwebservices.model.SomeBean;

@RestController
public class FilteringController {

	@GetMapping("/filtering")
	public SomeBean retrieveSomeBean() {
		return new SomeBean("value1", "value2", "value3");
	}

	@GetMapping("/filtering-list")
	public List<SomeBean> retrieveListOfSomeBean() {
		return Arrays.asList(new SomeBean("value1", "value2", "value3"), new SomeBean("value1", "value2", "value3"));
	}
}
