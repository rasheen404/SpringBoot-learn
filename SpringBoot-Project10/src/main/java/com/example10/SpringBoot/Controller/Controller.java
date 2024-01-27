package com.example10.SpringBoot.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/control")
public class Controller {
	
	@PostMapping
	public String CalulateAverage(@RequestParam String name,int mark1,int mark2,int mark3,int mark4,int mark5)
	{
		double percentage = ((mark1+mark2+mark3+mark4+mark5)/500)*100;
		return name+" percentage is "+percentage+"%";
		
	}

}
