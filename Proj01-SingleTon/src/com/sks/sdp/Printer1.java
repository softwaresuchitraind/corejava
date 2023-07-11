package com.sks.sdp;

import com.sks.commons.CommonsUtil;

public class Printer1 extends CommonsUtil
{
	
	private Printer1()
	{
		System.out.println("Printer 0-param:: Constructor ");

	}
	
	private static class InnerPrinter1
	{
		private static volatile Printer1 INSTANCE=new Printer1();
	}
	
	

	// static factory method

	public static Printer1 getInstance()
	{
		
		return InnerPrinter1.INSTANCE;
	}
	
	public Object clone()throws CloneNotSupportedException
	{
		throw new CloneNotSupportedException("Cloning not allowed");
		//return InnerPrinter1.INSTANCE;
	}
	
	//to stop deserialization
	
	private static final long serialVersionUID=5453496L;
	public Object readResolve()
	{
		//return InnerPrinter1.INSTANCE;
		throw new IllegalArgumentException("Desialization is not allowed");
	}

	// b.method

	public void print(String msg)
	{
		System.out.println(msg);

	}
}
