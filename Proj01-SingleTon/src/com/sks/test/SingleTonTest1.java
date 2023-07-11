package com.sks.test;

import com.sks.sdp.Printer;
import com.sks.sdp.Printer1;

public class SingleTonTest1
{
	public static void main(String[] args)
	{
		Printer1 p1 = Printer1.getInstance();
		Printer1 p2 = Printer1.getInstance();
		System.out.println(p1.hashCode()+"-----"+p2.hashCode());
		System.out.println("p1==p2 ? ::-----"+(p1==p2));
	}
}
