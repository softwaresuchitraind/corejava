package com.sukla.java8;
@FunctionalInterface
 interface MyInterfaceTwo
 {
	 public void m2();
 }
public class MyAppTwo 
{
	
	public static void main(String[] args)
	{
		MyInterfaceTwo myInterfaceTwo=()->System.out.println("myApp two");
	    myInterfaceTwo.m2();
	}
}
