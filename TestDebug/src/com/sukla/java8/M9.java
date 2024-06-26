package com.sukla.java8;

import java.util.Arrays;
import java.util.List;

public class M9
{
	public static void main(String[] args)
	{
		List<String> java=Arrays.asList("core java","adv java","boot");
		List<String> ui=Arrays.asList("html","css","java script");
		List<List<String>> asList = Arrays.asList(java,ui);
		asList.stream().flatMap(x->x.stream()).forEach(x->System.out.println(x));
	}

}
