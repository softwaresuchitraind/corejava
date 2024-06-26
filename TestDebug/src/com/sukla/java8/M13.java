package com.sukla.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Write a java program to find max ,min and average salary of employee
public class M13
{
	public static void main(String[] args)
	{
		Employee2 e1 = new Employee2("1","Suchitra",2000.0);
		Employee2 e2 = new Employee2("2","Sam",5000.0);
		Employee2 e3 = new Employee2("3","Chin",4000.0);
		Employee2 e4 = new Employee2("4","Ayan",1000.0);
		List<Employee2> list = Arrays.asList(e1,e2,e3,e4);
		//Stream<Employee2> stream = Stream.of(e1,e2,e3,e4);
		Optional<Employee2> maxSal = list.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.sal)));
		System.out.println("Maximum Salary: "+maxSal.get().sal);
		Optional<Employee2> minSal = list.stream().collect(Collectors.minBy(Comparator.comparing(e->e.sal)));
		System.out.println("Minumnum Salary"+minSal.get().sal);
		
		Double averageSal = list.stream().collect(Collectors.averagingDouble(e->e.sal));
		System.out.println(averageSal);
		
	}

}
class Employee2
{
	String id;
	String name;
	double sal;
	
	Employee2(String id,String name,double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}

	@Override
	public String toString()
	{
		return "Employee2 [id=" + id + ", name=" + name + ", salary=" + sal + "]";
	}
	
	
}
