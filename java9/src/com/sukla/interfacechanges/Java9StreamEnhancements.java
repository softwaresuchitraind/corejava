package com.sukla.interfacechanges;

import java.util.ArrayList;
import java.util.List;

public class Java9StreamEnhancements
{
	public static void main(String[] args)
	{

		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(15);
		list1.add(40);
		list1.add(55);
		list1.add(60);
		list1.add(75);
		list1.add(10);
		
		//list1.stream().limit(3).forEach(p->System.out.println(p));
		System.out.println("skip statement");
		//list1.stream().skip(3).forEach(p->System.out.println(p));
		System.out.println("Take while");
		list1.stream().takeWhile(p->p%2==0).forEach(p->System.out.println(p));
		System.out.println("drop while");
		list1.stream().dropWhile(p->p%2==0).forEach(p->System.out.println(p));
		System.out.println("filter");
		list1.stream().filter(p->p%2==0).forEach(p->System.out.println(p));
		//drop while
		//take while
		
		
	}
	
	
}
