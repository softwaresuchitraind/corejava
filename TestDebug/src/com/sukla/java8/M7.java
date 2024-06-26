package com.sukla.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class M7
{
	public static void main(String[] args)
	{
		List<String> names = Arrays.asList("Japan","India","Usa","uk","Iskonas");
		//names.stream().map(x->x.toUpperCase()).forEach(i->System.out.println(i));
		//names.stream().mapToInt(name->name.length()).forEach((i)->System.out.println(i));
		
		//print name with its length which are starting with char I
		
		names.stream().filter(x->x.startsWith("I")).map(x->x +"-"+x.length()).forEach(i->System.out.println(i));
	}

}
