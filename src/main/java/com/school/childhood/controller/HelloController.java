package com.school.childhood.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value="Spring Demp APIS")
public class HelloController {
	
	@ApiOperation(value="Hello",tags= {"Hello Programmes"})
	@RequestMapping(method = RequestMethod.GET, value = "/javainuse")
	public String sayHello() {
		return "Swagger Hello World";
	}
}
