package com.sukla.java8;
 interface MyInterfaceOne
 {
	 public void m1();
 }
public class MyAppOne implements MyInterfaceOne
{
	@Override
	public void m1()
	{
		System.out.println("My App1");
		
	}
	public static void main(String[] args)
	{
		MyAppOne myAppOne = new MyAppOne();
		myAppOne.m1();
	}
}
