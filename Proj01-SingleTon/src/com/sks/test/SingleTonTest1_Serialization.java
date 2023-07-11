package com.sks.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.sks.sdp.Printer1;

public class SingleTonTest1_Serialization
{
	public static void main(String[] args)
	{
		try
		{
			Printer1 p1 = Printer1.getInstance();
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("printer_data_ser"));
			oos.writeObject(p1);
			oos.flush();
			oos.close();
			System.out.println("Serialization done");
			
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
