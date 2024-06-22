package com.sukla.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee
{
	String name;
	String loc;
	String dept;
	public Employee(String name, String loc, String dept)
	{
		
		this.name = name;
		this.loc = loc;
		this.dept = dept;
	}
	
}
public class PredicateExample4
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee("Suchitra", "BLR", "QA");
		Employee e2 = new Employee("Amit", "HYD", "DEV");
		Employee e3 = new Employee("Tulu", "HYD", "QA");
		Employee e4 = new Employee("Kaju", "BBSR", "TEST");
		
		List<Employee> empList=Arrays.asList(e1,e2,e3,e4);
		Predicate<Employee> p1 = p->p.loc.equals("HYD");
		Predicate<Employee> p2 = p->p.dept.equals("QA");
		Predicate<Employee> p3 = p->p.name.startsWith("T");
		//predicate joining
		Predicate<Employee> p4= p1.and(p2).and(p3);
		
		for(Employee e : empList)
		{
			if(p4.test(e))
			{
				System.out.println(e.name);
			}
		}
	}

}
