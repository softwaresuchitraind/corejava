package com.sukla.streamjavat;
interface Calculator1
{
	int substract(int a,int b);
}
public class M10
{
	public static void main(String[] args)
	{
		/* Calculator1 c=(a,b)->b-a; */
		Calculator1 c = (a,b)->{
			if(b<a)
			{
				throw new RuntimeException("Please provide correct value");
			}
			else
			{
				return b-a;
			}
		};
		int value = c.substract(2, 10);
		System.out.println(value);
	}
}
