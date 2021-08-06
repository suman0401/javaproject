package com.bike.service;

import com.bike.exception.BikeNotFoundException;
import com.bike.model.*;

public class BikeService implements BikeInter{

	@Override
	public Bike getbyModel(String model) throws BikeNotFoundException {
		// TODO Auto-generated method stub
		boolean b=false;
		Bike abike = null;
		
		for (Bike bike : allBikes()) {
			if ((bike.getModel()).equals(model)) {
				b = true;
				//return abike;
				abike = bike;
			}

		}
		if (b==false) {
			throw new BikeNotFoundException("Invalid MobileId");
		}

		return abike;

	}
		
	

	@Override
	public Bike[] getAll() {
		// TODO Auto-generated method stub
		return allBikes();
	}

	@Override
	public Bike[] getbyName(String name) throws BikeNotFoundException {
		// TODO Auto-generated method stub
		boolean b=false;
		int x=0;
		Bike[] abike=new Bike[5];
		for (Bike bike : allBikes()) {
			if ((bike.getName()).equals(name)) {
				b = true;
				abike[x++] = bike;
			}

		}
		if (b==false) {
			throw new BikeNotFoundException("Invalid brand name");
		}

		return abike;
		
	}
	private Bike[] allBikes() {
		Bike[] bBike = new Bike[5];
		bBike[0] = new Bike("YAHAMA","RED","R15",50000d);
		bBike[1] = new Bike("ROYAL ENFIELD","BLACK","CLASSIC",150000d);
		bBike[2] = new Bike("PULSAR","BLUE","NS-200",200000d);
		bBike[3] = new Bike("BMW","GRAY","GS",300000d);
		bBike[4] = new Bike("APPACHI","GREEN","RTR",250000d);
		
		return bBike;

}
}
