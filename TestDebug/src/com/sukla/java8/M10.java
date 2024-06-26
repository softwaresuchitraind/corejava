package com.sukla.java8;

import java.util.Arrays;
import java.util.List;

public class M10
{
	public static void main(String[] args)
	{
		List<String> java=Arrays.asList("core java","adv java","boot","rest api","mock");
		//java.stream().limit(3).forEach(x->System.out.println(x));
		//java.stream().skip(3).forEach(x->System.out.println(x));
		List<String> list = Arrays.asList("sukla","sukla","suchitra","ram","ram");
		list.stream().distinct().forEach(x->System.out.println(x));
		
	}

}
