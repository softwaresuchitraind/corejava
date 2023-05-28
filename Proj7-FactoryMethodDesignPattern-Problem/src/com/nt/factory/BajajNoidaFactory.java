package com.nt.factory;

public class BajajNoidaFactory
{
	public void paint()
	{
		System.out.println("Painting Bajaj Bike");
	}
	
	public void assemble()
	{
		System.out.println("Assembling Bajaj Bike");
	}
	public void roadTest()
	{
		System.out.println("RoadTesting of Bajaj Bike");
	}
	public void oiling()
	{
		System.out.println("Oiling of Bajaj Bike");
	}
	
	//factory method
	public static BajajBike createBike(String type)
	{
		BajajBike bike = null;
		if(type.equalsIgnoreCase("discover"))
			bike =new BajajDiscover();
		
	}
	
	
}
