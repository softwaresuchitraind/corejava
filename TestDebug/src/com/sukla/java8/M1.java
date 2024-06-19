package com.sukla.java8;

interface Vehicle
{
	public void start();
	//public void clean();
	public default void clean()
	{
		System.out.println("Cleaning completed");
	}
}
public class M1 implements Vehicle
{
	@Override
	public void start()
	{
		System.out.println("Car started");
		
	}
	public static void main(String[] args)
	{
		M1 m1 = new M1();
		m1.start();
		m1.clean();
	}
}
