package com.sks.test;

import com.sks.sdp.Printer;

public class SingleTonTest1
{
	public static void main(String[] args)
	{
		Printer p1 = Printer.getInstance();
		Printer p2 = Printer.getInstance();
		System.out.println(p1.hashCode()+"-----"+p2.hashCode());
		System.out.println("p1==p2 ? ::-----"+(p1==p2));
	}
}
