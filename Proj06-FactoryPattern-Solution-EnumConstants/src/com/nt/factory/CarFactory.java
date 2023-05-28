package com.nt.factory;

import com.sukla.comps.BalenoCar;
import com.sukla.comps.Car;
import com.sukla.comps.CarTyres;
import com.sukla.comps.ErtigaCar;
import com.sukla.comps.SwiftCar;

public class CarFactory
{
	//static factory method
	
	public static Car getCar(CarType type)
	{
		Car car = null;
		//create CarTyres object
		CarTyres tyres = new CarTyres();
		if(type==CarType.BALENO)
		{
			car = new BalenoCar(tyres);
		}
		else if(type==CarType.SWIFT)
		{
			car = new SwiftCar(tyres);
		}
		else if(type==CarType.ERTIGA)
		{
			car = new ErtigaCar(tyres);
		}
		else
		{
			throw new IllegalArgumentException("invalid car type");
		}
		car.assemble();
		car.roadTest();
		return car;
		
	}//method

}//class
