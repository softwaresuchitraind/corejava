package com.sukla.java8;

import java.util.stream.Stream;

//Print Employee name and age whose salary is > 50000

public class M8
{
	public static void main(String[] args)
	{
		Employee1 e1 = new Employee1("john",25,51000.0);
		Employee1 e2 = new Employee1("Raj",18,20000.0);
		Employee1 e3 = new Employee1("Sami",35,50000.0);
		Employee1 e4 = new Employee1("Kansi",45,76000.0);
		
		Stream<Employee1> stream = Stream.of(e1,e2,e3,e4);
		//stream.filter(x->x.sal > 50000.0).map(x->x.name+ "--"+x.sal).forEach(x->System.out.println(x));
		stream.filter(x->x.sal > 50000.0).forEach(x->System.out.println(x.name+ "-"+x.sal));
	}
}
class Employee1
{
	String name;
	int age;
	double sal;
	
	public Employee1(String name, int age, double sal)
	{
		
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	
	
}