package com.sukla.stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test
{
	public static void main(String[] args)
	{
		List<Employ> empList = new ArrayList<Employ>();
		empList.add(new Employ(101, "Suchitra", "male", 33, 90000.0, 2004, "IT"));
		empList.add(new Employ(102, "abc", "male", 35, 80000.0, 2022, "IT"));
		empList.add(new Employ(103, "def", "male", 35, 70000.0, 2006, "HR"));
		empList.add(new Employ(104, "ghi", "Female", 36, 60000.0, 2020, "IT"));
		empList.add(new Employ(105, "jkl", "male", 37, 80000.0, 2008, "HR"));
		empList.add(new Employ(106, "mno", "female", 36, 90000.0, 2010, "IT"));
		empList.add(new Employ(107, "pqr", "male", 43, 50000.0, 2012, "sales"));
		empList.add(new Employ(108, "stu", "female", 53, 40000.0, 2015, "IT"));
		empList.add(new Employ(109, "xyz", "male", 23, 40000.0, 2019, "sales"));

		// list the 5+ years of experience employee
		// empList.stream().filter(x->x.getYearofJoining()<2018).forEach(System.out::println);

		// Increment the 10% salary for 5+ years of experience
		/*
		 * empList.stream().filter(x->x.getYearofJoining()<2018).map(emp-> { double
		 * incrementSal = emp.getEmpSal()+((emp.getEmpSal()*10)/100);
		 * emp.setEmpSal(incrementSal); return emp; } ).forEach(System.out::println);
		 */

		System.out.println("===============================================");
		// Increment the 10% salary for 5+ years of experience--way2--peek()

		empList.stream().filter(x -> x.getYearofJoining() < 2018)
				.peek(emp -> emp.setEmpSal(emp.getEmpSal() + (emp.getEmpSal() * 10) / 100))
				.forEach(System.out::println);
		System.out.println("-------------------------");

		// find the max salary
		Employ employ = empList.stream().max(Comparator.comparingDouble(Employ::getEmpSal)).get();
		System.out.println(employ);
		System.out.println("======================================================================");
		// find the max salary-way2
		Employ employ1 = empList.stream()
						.collect(Collectors.maxBy(Comparator.comparing(Employ::getEmpSal))).get();
		//System.out.println(employ1);
		
		List<Employ> sortedASC = empList.stream().sorted((emp1,emp2)->emp1.getEmpSal()>emp2.getEmpSal()?1:-1).collect(Collectors.toList());
		//System.out.println(sortedASC);
		//sortedASC.forEach(emp->System.out.println(emp));
		
		//4.Sort the employees by ascending/decending order based on anu property
		List<Employ> sortedDESC = empList.stream().sorted((emp1,emp2)->emp1.getEmpSal()>emp2.getEmpSal()?-1:1).collect(Collectors.toList());
		//System.out.println(sortedASC);
		//sortedDESC.forEach(emp->System.out.println(emp));
		
		//4.Sort the employees by ascending/decending order based on anu property-way2
		System.out.println("============================================");
		List<Employ> sortedASC1 = empList.stream()
				.sorted((Comparator.comparingDouble(Employ::getEmpSal))).collect(Collectors.toList());
		sortedASC1.forEach(emp->System.out.println(emp));
		//4.Sort the employees by ascending/decending order based on anu property-way2
		System.out.println("============================================");
		List<Employ> sortedDESC1 = empList.stream()
				.sorted((Comparator.comparingDouble(Employ::getEmpSal).reversed())).collect(Collectors.toList());
		sortedDESC1.forEach(emp->System.out.println(emp));
		
		//Get the list of employee names in ascending order
		System.out.println("============================================");
		List<String> empASCNames = empList.stream()
				.sorted((Comparator.comparing(Employ::getEmpName)))
				.map(emp->emp.getEmpName())
				.collect(Collectors.toList());
		 empASCNames.forEach(emp->System.out.println(emp));
		 
		 //Finding the second and third highest salary
		 System.out.println("============================================");
		 Employ secondHighestSalEmp=empList.stream()
				 .sorted(Comparator.comparingDouble(Employ::getEmpSal).reversed())
				 .skip(1)
				 .findFirst().get();
		 System.out.println(secondHighestSalEmp);
		 
		 //7.Calculate the total Salary employees in the company
		 Double totalSal=empList.stream().collect(Collectors.summingDouble(Employ::getEmpSal));
		 System.out.println(totalSal);
		 
		 //8. Calculate the company average salary
		 Double companyAverageSal = empList.stream().collect(Collectors.averagingDouble(Employ::getEmpSal));
		 System.out.println(companyAverageSal);
		 
		 //9.Count male and female employess
		 //way-1
		 System.out.println("=====================================");
		 long femaleCount = empList.stream().filter(emp->emp.getGender().equals("female")).count();
		 System.out.println(femaleCount);
		 System.out.println("=====================================");
		 long maleCount = empList.stream().filter(emp->emp.getGender().equals("male")).count();
		 System.out.println(maleCount);
		 //way-2
		 System.out.println("=====================================");
		 Map<String,Long> maleFemaleCounts=empList.stream().collect(Collectors.groupingBy(Employ::getGender,Collectors.counting()));
		 System.out.println(maleFemaleCounts);
		 
		 //10.male and female average salary
		 System.out.println("=====================================");
		 Double averageSalary = empList.stream().filter(x->x.getGender().equals("female")).collect(Collectors.averagingDouble(Employ::getEmpSal));
		 System.out.println(averageSalary);
		 System.out.println("=====================================");
		 Double maleaverageSalary = empList.stream().filter(x->x.getGender().equals("male")).collect(Collectors.averagingDouble(Employ::getEmpSal));
		 System.out.println(maleaverageSalary );
		 System.out.println("=====================================");
		 Map<String,Double> maleFemaleaverageSal=empList.stream()
		 .collect(Collectors.groupingBy(Employ::getGender,Collectors.averagingDouble(Employ::getEmpSal)));
		 System.out.println("Male and female Average Salary"+maleFemaleaverageSal);
		 
		 //Get Department List in the company
		 System.out.println("=============================");
		 List<String> getAllDepartments = empList.stream().map(x->x.getDepartment()).distinct().collect(Collectors.toList());
		 System.out.println(getAllDepartments);
		 
		 //get the Employees departmentwise
		 System.out.println("=============================");
		 Map<String,List<Employ>> getEmpDeptWise =empList.stream()
				 .collect(Collectors.groupingBy(Employ::getDepartment));
		 //System.out.println(getEmpDeptWise);
		 getEmpDeptWise.forEach((k,v)->System.out.println(k+"----------"+v));
		 System.out.println("=============================");
		 //empList.stream()
		 
		 //13.Find each department highest salary employee info in the form of department as key and value as the 
		 Map<String, Employ> deptEmpMap = empList.stream()
		 .collect(Collectors.groupingBy(Employ::getDepartment,
				 Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employ::getEmpSal)), Optional::get)));
		 
		 for(Map.Entry<String,Employ> entry :deptEmpMap.entrySet())
		 {
			 System.out.println(entry.getKey()+"-->"+entry.getValue().getEmpName()+","+entry.getValue().getEmpSal()+","+entry.getValue().getDepartment());
		 }
		 
		 System.out.println("================");
		 //14.Count the each character of the string
		 //1st way
		 String s1 = "james Gosling";
		 String[] chars = s1.split("");
		 Map<String, Long> charsCount = Arrays.stream(chars).collect(Collectors.groupingBy(s->s,Collectors.counting()));
		 System.out.println(charsCount);
		 
		 System.out.println("=========================");
		 //2nd way
		 Map<String, Long> charsCount1 = Arrays.stream(chars).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println(charsCount1);
		 
		 System.out.println("=====================================================");
		 
		 //15. Find unique characters of a String
		 List<String> uniqueCharacters = Arrays.stream(chars).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		 				.entrySet().stream().filter(entry->entry.getValue()==1)
		 				.map(entry->entry.getKey())
		 				.collect(Collectors.toList());
		 System.out.println(uniqueCharacters);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
