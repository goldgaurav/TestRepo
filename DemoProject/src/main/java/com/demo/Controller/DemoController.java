package com.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/hello")
	public String returnMsg()	
	{
		System.out.println(" here");
		return "hi";
	}
}
