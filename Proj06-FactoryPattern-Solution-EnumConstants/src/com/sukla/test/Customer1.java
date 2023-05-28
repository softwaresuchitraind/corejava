package com.sukla.test;

import com.nt.factory.CarFactory;
import com.nt.factory.CarType;
import com.sukla.comps.BalenoCar;
import com.sukla.comps.Car;
import com.sukla.comps.CarTyres;

public class Customer1
{

	public static void main(String[] args)
	{
		Car car1 = CarFactory.getCar(CarType.BALENO);
		System.out.println(car1);
	}

}
