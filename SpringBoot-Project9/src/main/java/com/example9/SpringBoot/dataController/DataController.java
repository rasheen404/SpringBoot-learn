package com.example9.SpringBoot.dataController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/control")
public class DataController {
	
	@GetMapping
	public String displayData(@RequestParam String data)
	{
		return "Entered data is :"+data;
	}

}
