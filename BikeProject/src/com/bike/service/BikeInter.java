package com.bike.service;

import com.bike.exception.BikeNotFoundException;
import com.bike.model.Bike;

public interface BikeInter {
	Bike getbyModel(String bikemodel) throws BikeNotFoundException;
	Bike [] getAll();
	Bike[] getbyName(String name) throws BikeNotFoundException ;

}
