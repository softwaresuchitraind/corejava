package com.sukla.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Write a java program to find max ,min and average salary of employee
public class M14
{
	public static void main(String[] args)
	{
		Employee3 e1 = new Employee3("1","Suchitra",2000.0,"INDIA");
		Employee3 e2 = new Employee3("2","Sam",5000.0,"INDIA");
		Employee3 e3 = new Employee3("3","Chin",4000.0,"USA");
		Employee3 e4 = new Employee3("4","Ayan",1000.0,"CANADA");
		List<Employee3> list = Arrays.asList(e1,e2,e3,e4);
		Map<String, List<Employee3>> collect = list.stream().collect(Collectors.groupingBy(x->x.country));
		System.out.println(collect);
		
	}

}
class Employee3
{
	String id;
	String name;
	double sal;
	String country;
	
	Employee3(String id,String name,double sal,String country)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.country=country;
	}

	@Override
	public String toString()
	{
		return "Employee3 [id=" + id + ", name=" + name + ", sal=" + sal + ", country=" + country + "]";
	}


	
}
