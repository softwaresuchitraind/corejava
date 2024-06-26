package com.sukla.java8;

import java.util.Arrays;
import java.util.List;

public class M11
{
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args)
	{
		Person1 p1 = new Person1("John","INDIA");
		Person1 p2 = new Person1("Sam","USA");
		Person1 p3 = new Person1("Suchitra","China");
		Person1 p4 = new Person1("Kumar","APAC");
		List<Person1> persons = Arrays.asList(p1,p2,p3,p4);
		boolean anymath = persons.stream().anyMatch(p->p.country.equals("INDIA"));
		System.out.println("Any Indian Available :: "+anymath);
		boolean anymath1 = persons.stream().anyMatch(p->p.country.equals("CANADA"));
		System.out.println("Any Indian Available :: "+anymath1);
		boolean anymath2 = persons.stream().allMatch(p->p.country.equals("CANADA"));
		System.out.println("All persons :: "+anymath2);
		boolean anymath3 = persons.stream().noneMatch(p->p.country.equals("MAXICO"));
		System.out.println("All persons :: "+anymath3);
	}

}
class Person1
{
	String name;
	String country;
	Person1(String name,String country)
	{
		this.name=name;
		this.country=country;
	}
	
}
