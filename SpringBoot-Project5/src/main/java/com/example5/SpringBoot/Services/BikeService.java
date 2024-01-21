package com.example5.SpringBoot.Services;

import java.util.List;

import com.example5.SpringBoot.Entities.Bike;

public interface BikeService {

	public String createBike(Bike bike);

	public List<Bike> fetchBike();

	public String updateBike(Bike bike);

	public String deleteBike(String engNo);
}
