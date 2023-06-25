package com.sks.sdp;

public class Printer
{
	private static Printer INSTANCE;
	
	//private constructor
	private Printer()
	{
		System.out.println("Printer 0-param:: Constructor ");
			
	}
	
	//static factory method
	
	public static Printer getInstance()
	{
		if (INSTANCE== null)
			INSTANCE = new Printer();
		return INSTANCE;
	}
	
	//b.method
	
	public void print(String msg)
	{
		System.out.println(msg);
		
	}
}
