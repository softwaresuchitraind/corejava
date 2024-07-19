package com.sukla.streamjavat;
interface Calculator
{
	//void print();
	void sum(int i);
}
public class M9
{
	public static void main(String[] args)
	{
		/*
		Calculator c=()->System.out.println("Printing............");
		c.print();*/
		
		Calculator c=(x)->{
			System.out.println("sum is"+x);
			};
			c.sum(198);
	}
}
