package com.example11.SpringBoot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataController {

	@GetMapping("/display")
	public String displayData() {
		return "response";
	}

}
