package com.example5.SpringBoot.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example5.SpringBoot.Entities.Bike;
import com.example5.SpringBoot.Services.BikeService;

@RestController
@RequestMapping("/Bike")
public class BikeController {
	
BikeService bikeService;



	public BikeController(BikeService bikeService) {
	super();
	this.bikeService = bikeService;
}



	@PostMapping
	public String createBike(@RequestBody Bike bike) {
		String msg = bikeService.createBike(bike);
		return msg;
	}

//	@GetMapping
//	public Bike fetchBike()
//	{
//		
//	}
//	
//	@PutMapping
//	public String updateBike()
//	{
//		
//	}
//	
//	@DeleteMapping
//	public String deleteBike()
//	{
//		
//	}
//	

}
