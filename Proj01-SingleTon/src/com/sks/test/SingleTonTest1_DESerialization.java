package com.sks.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.sks.sdp.Printer1;

public class SingleTonTest1_DESerialization
{
	public static void main(String[] args)
	{
		try
		{
			
			ObjectInputStream oos = new ObjectInputStream(new FileInputStream("printer_data_ser"));
			Printer1 p2 =(Printer1)oos.readObject();
			p2.print("hello");
			System.out.println("p2 object hashCode  "+p2.hashCode());
			oos.close();
			System.out.println("DESerialization done");
			
		} catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
