package com.example5.SpringBoot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example5.SpringBoot.Entities.Bike;

public interface BikeRepository extends JpaRepository<Bike, String>
{

}


//bike 