package com.sks.test;

public class SingleTonTest1Multithreded
{
	public static void main(String[] args)
	{
		TicketBookingServlet servlet = new TicketBookingServlet();
		Thread t1 = new Thread(servlet);
		Thread t2 = new Thread(servlet);
		Thread t3 = new Thread(servlet);
		long start=System.currentTimeMillis();
		t1.start();
		t2.start();
		t3.start();
		long end=System.currentTimeMillis();
		System.out.println("Time" +(end-start));
	}
}
