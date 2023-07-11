package in.suklak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2
{
	public static void main(String[] args)
	{
		
		
		/*
		 * Limit Skip
		 * */
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(15);
		numbers.add(20);
		numbers.add(30);
		numbers.add(25);
		numbers.add(45);
		numbers.add(5);
		numbers.add(15);
		numbers.add(55);
		
		System.out.println("For each Example");
		numbers.stream().forEach(p->System.out.println(p));
		System.out.println("For Each Ordered");
		numbers.stream().forEachOrdered(p->System.out.println(p));
		
		System.out.println("##############");
		//Write a stream program to display second largest number
		numbers.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).forEach((p)->System.out.println(p));
		
		numbers.stream().skip(3).forEach((p)->System.out.println(p));
		System.out.println("##############");
		numbers.stream().sorted(Collections.reverseOrder()).limit(1).forEach((p)->System.out.println(p));
		System.out.println(numbers.stream().limit(4));
		
		numbers.stream().limit(4).forEach(p->System.out.println(p));
		System.out.println("---------------------");
		numbers.stream().limit(4).filter((p)->p>10).forEach(p->System.out.println(p));
		List<String> stringList = new ArrayList<String>();
		stringList.add("Kit");
		stringList.add("Kit");
		stringList.add("SucKit");
		stringList.add("SucKit");
		stringList.add("Kijjt");
		stringList.add("SuchitraKit");
		stringList.add("BhatKit");
		
		//Write a program to print first number in the given array.
		//numbers.stream().findFirst()
		
		System.out.println(stringList.stream().collect(Collectors.groupingBy((p)->p,Collectors.counting())));
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(123,"suchitra",10000));
		empList.add(new Employee(123,"suchitra",10000));
		empList.add(new Employee(124,"kditya",5000));
		empList.add(new Employee(125,"Atul",30000));
		empList.add(new Employee(126,"Vaibhav",40000));
		empList.add(new Employee(127,"Shesha",51000));
		empList.add(new Employee(128,"khesha",50000));
		
		
		System.out.println("-----------------------------------------------------------------");
		List<String> l1 = new ArrayList<String>();
		l1.add("koushav");
		l1.add("ketan");
		List<String> l2 = new ArrayList<String>();
		l2.add("Suchitra");
		l2.add("saumya");
		List<List<String>> l3 = new ArrayList<List<String>>();
		l3.add(l1);
		l3.add(l2);
		
		/*l4<String>*/
		//input is List<List> and out List
		
		System.out.println(l3.stream().flatMap(p->p.stream()).collect(Collectors.toList()));
		//empList.stream().mapToDouble((p)->p.getEmpSal()).collect(Collectors.toList());
		
		//write a program for second largest employee salary
		System.out.println("SSSSSSSSSSSSSSSSS");
		empList.stream().sorted((t1,t2)->(t1.getEmpSal()<t2.getEmpSal())?1:(t1.getEmpSal()==t2.getEmpSal())?0:-1).limit(2).skip(1).forEach((e)->System.out.println(e));
		
		System.out.println(empList.stream().collect(Collectors.groupingBy((p)->p.getEmpName(),Collectors.counting())));
		
		DoubleSummaryStatistics d = empList.stream().collect(Collectors.summarizingDouble((p)->p.getEmpSal()));
		System.out.println(d);
		System.out.println(d.getAverage());
		System.out.println(d.getMax());
		System.out.println(d.getMin());
	}
}
/*
 * Optional-java.util
 * 
 * 
 * What is the differnce between map() and flatmap()
 * 
 * flatmap will provide one to many mapping where as map provide one to one mapping
 * */

