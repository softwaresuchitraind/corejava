package com.sukla.java8;

public class M3
{
	public static void main(String[] args)
	{
		Runnable r1 = new Runnable()
				{
					@Override
					public void run()
					{
						for(int i=1;i<=5;i++)
						{
							System.out.println(i);
						}
						
					}
				};
				
				Thread t= new Thread(r1);
				t.start();
	}

}
