package com.sukla.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person
{
	String name;
	int age;
	
	public Person()
	{
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	
}
public class PredicateExample3
{
	public static void main(String[] args)
	{
		Person p1 = new Person("Suchitra",18);
		Person p2 = new Person("Akash",8);
		Person p3 = new Person("Amit",56);
		Person p4 = new Person("John",25);
		List<Person> list1 = Arrays.asList(p1,p2,p3,p4);
		
		Predicate<Person> predicate=p-> p.age>=18;
		
		for(Person person : list1)
		{
			if(predicate.test(person))
			{
				System.out.println(person.name);
			}
		}
		
		
	}

}
