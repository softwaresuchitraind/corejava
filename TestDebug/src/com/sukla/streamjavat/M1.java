package com.sukla.streamjavat;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Count letters in the string
public class M1
{
	public static void main(String[] args)
	{
		String arr[]= {"hello","mango","Hi","Hello"};
		/*
		int[] arr1 = Arrays.stream(arr).mapToInt(String::length).toArray();
		for(int i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"--"+arr1[i]);
		}*/
	  //Arrays.stream(arr).map(x->x+"--"+x.length()).forEach(System.out::println);
	}
}
