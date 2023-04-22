package com.nt.factory;

import com.sukla.comps.BalenoCar;
import com.sukla.comps.Car;
import com.sukla.comps.CarTyres;
import com.sukla.comps.ErtigaCar;
import com.sukla.comps.SwiftCar;

public class CarFactory
{
	//static factory method
	
	public static Car getCar(String type)
	{
		Car car = null;
		//create CarTyres object
		CarTyres tyres = new CarTyres();
		if(type.equalsIgnoreCase("baleno"))
		{
			car = new BalenoCar(tyres);
		}
		else if(type.equalsIgnoreCase("swift"))
		{
			car = new SwiftCar(tyres);
		}
		else if(type.equalsIgnoreCase("ertiga"))
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
