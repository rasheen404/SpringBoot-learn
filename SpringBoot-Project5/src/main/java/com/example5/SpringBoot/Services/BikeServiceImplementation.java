package com.example5.SpringBoot.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example5.SpringBoot.Entities.Bike;
import com.example5.SpringBoot.Repositories.BikeRepository;

@Service
public class BikeServiceImplementation implements BikeService{

	BikeRepository bikerepository;
	
	public BikeServiceImplementation(BikeRepository bikerepository) {
		super();
		this.bikerepository = bikerepository;
	}

	@Override
	public String createBike(Bike bike) {
		
		bikerepository.save(bike);
		return "Bike Object is created and saved.";
	}

	@Override
	public List<Bike> fetchBike() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateBike(Bike bike) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteBike(String engNo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}