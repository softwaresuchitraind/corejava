package com.sks.sdp;

public class Printer
{
	private static volatile Printer INSTANCE;//volatile variable- Object creation,initialization and assignment happens in a songle slot

	// private constructor
	private Printer()
	{
		System.out.println("Printer 0-param:: Constructor ");

	}
	
	

	// static factory method

	public static Printer getInstance()
	{
		if (INSTANCE == null)
		{
			synchronized (Printer.class)
			{
				if (INSTANCE == null)
					INSTANCE = new Printer();

			}
		}
		return INSTANCE;
	}

	// b.method

	public void print(String msg)
	{
		System.out.println(msg);

	}
}
