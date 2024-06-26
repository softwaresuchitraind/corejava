package com.sukla.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class M12
{
	
	public static void main(String[] args)
	{
		Person2 p1 = new Person2("John","INDIA");
		Person2 p2 = new Person2("Sam","USA");
		Person2 p3 = new Person2("Suchitra","China");
		Person2 p4 = new Person2("Kumar","INDIa");
		List<Person2> persons = Arrays.asList(p1,p2,p3,p4);
		/*Optional<Person2> first = persons.stream().filter(x->x.country.equalsIgnoreCase("INDIA")).findAny();
		
		if(first.isPresent())
		{
			System.out.println(first.get());
		}*/
		/*
		List<Person2> india = persons.stream().filter(x->x.country.equalsIgnoreCase("INDIA")).collect(Collectors.toList());
		System.out.println(india.size());*/
		
		//collect names of the person who are belongs to india and store in names collection
		List<String> names = persons.stream().filter(x->x.country.equalsIgnoreCase("INDIA")).map(x->x.name).collect(Collectors.toList());
		System.out.println(names);
	}

}
class Person2
{
	String name;
	String country;
	Person2(String name,String country)
	{
		this.name=name;
		this.country=country;
	}
	@Override
	public String toString()
	{
		return "Person2 [name=" + name + ", country=" + country + "]";
	}
	
	
}
