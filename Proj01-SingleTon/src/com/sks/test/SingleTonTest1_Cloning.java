package com.sks.test;

import com.sks.sdp.Printer1;

public class SingleTonTest1_Cloning
{

	public static void main(String[] args)
	{
		Printer1 p1 = Printer1.getInstance();
		
		//do cloning
		Printer1 p2=null;
		try
		{
			p2=(Printer1)p1.clone();
			System.out.println("cloned object is created");
			System.out.println(+p1.hashCode()+ " "+p2.hashCode());
			System.out.println("p1=p2 "+(p1==p2));
		}
		catch (CloneNotSupportedException cnse) {
			cnse.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
