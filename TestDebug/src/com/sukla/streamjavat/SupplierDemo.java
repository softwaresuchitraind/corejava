package com.sukla.streamjavat;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo
{
	public static void main(String[] args)
	{
		//Supplier<String> supplier =()-> "hello sukla";
		
		//System.out.println(supplier.get());
		
		List<String> asList = Arrays.asList();
		//asList.stream().findAny().orElseGet(supplier);
		
		System.out.print(asList.stream().findAny().orElseGet(()-> "hello sukla"));
	}

}
