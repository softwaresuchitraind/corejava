package com.sks.test;

import com.sks.sdp.Printer;

public class TicketBookingServlet implements Runnable
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		Printer p1 = Printer.getInstance();
		System.out.println(p1.hashCode());
		
	}
}
