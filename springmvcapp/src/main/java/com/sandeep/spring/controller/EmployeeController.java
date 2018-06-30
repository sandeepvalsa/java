package com.sandeep.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {
	
	@RequestMapping(method=RequestMethod.GET, value="/mypage")
	public String getView(){
		System.out.println("controller called");
		return "index";
	}

}
