package com.example.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="api")
public class HomeController 
{

	@RequestMapping("/hii")
	@ResponseBody
	public String hello()
	{
		System.out.println("Welcome to  capgemini");
		return "Welcome to  capgemini";
	}

}