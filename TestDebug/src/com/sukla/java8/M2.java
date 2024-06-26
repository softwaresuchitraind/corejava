package com.sukla.java8;
//Write a java program to print 1 to 5 using thread Runneable interface.


public class M2 implements Runnable
{
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		
	}
	public static void main(String[] args)
	{
		M2 m2 = new M2();
		Thread t = new Thread(m2);
		t.start();
		
	}
}
