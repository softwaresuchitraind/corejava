package com.sukla.streamjavat;

import java.util.Arrays;
import java.util.List;
//Third highest Salary of an Employee
public class M13
{

		public static void main(String[] args)
		{
			Employee e1 = new Employee("Sukla",25,500.0);
			Employee e2 = new Employee("abc",35,1500.0);
			Employee e3 = new Employee("pqr",55,2500.0);
			Employee e4 = new Employee("mno",85,400.0);
			Employee e5 = new Employee("xyz",95,5000.0);
			List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5);
			
			employees.stream().sorted((a,b)->b.getSal().compareTo(a.getSal()))
				//.forEach(System.out::println);
				.limit(3).skip(2).findFirst().ifPresent(System.out::println);
		}
}
