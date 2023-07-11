package in.suklak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample
{
	public static void main(String[] args)
	{
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(10);
		l.add(10);
		
		//Collection of datastructure
		//LinkedList, Stack and Queue, ArrayList->Data Structures
		
		//Stram-> Stream is used to perform the operation on the collection object
		
		Stream<String> of = Stream.of("hi","sdd");
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(123,"suchitra",10000));
		//empList.add(new Employee(123,"suchitra1",10000));
		empList.add(new Employee(124,"kditya",5000));
		empList.add(new Employee(125,"Atul",30000));
		empList.add(new Employee(126,"Vaibhav",40000));
		empList.add(new Employee(127,"Shesha",50000));
		empList.add(new Employee(128,"khesha",50000));
		
		//Write a program to create a list which contains Employee names whose name starts with k
		
		empList.stream().filter((p)->p.getEmpName().startsWith("k")).map((q)->q.getEmpName()).collect(Collectors.toList());
		
		//Write a program to convert the given empList into hashMap<empId,Emp>
		Map<Integer, Employee> m1 = empList.stream().collect(Collectors.toMap((p)->p.getEmpId(), (p)->p));
		System.out.println("Map Object is"+m1);
		
		
		System.out.println("Distinct employees");
		empList.stream().distinct().forEach((p)->System.out.println(p));
		System.out.println("###################");
		//write a stream program to sort based on salary
		empList.stream().sorted((t1,t2)->(t1.getEmpSal()<t2.getEmpSal())?-1:(t1.getEmpSal()==t2.getEmpSal())?0:1).forEach((e)->System.out.println(e));
		//write a stream program to sort based on desc salary
		System.out.println("Employee sorting based on salary");
		empList.stream().sorted((t1,t2)->(t1.getEmpSal()<t2.getEmpSal())?1:(t1.getEmpSal()==t2.getEmpSal())?0:-1).forEach((e)->System.out.println(e));
		
		
		System.out.println("sorted default method");
		empList.stream().sorted().forEach((e)->System.out.println(e));
		System.out.println("sorted default method DESC");
		empList.stream().sorted(Collections.reverseOrder()).forEach((e)->System.out.println(e));
		//Write a stream program to print emp name who is getting maximun salary
		System.out.println("Max Emp Salary ::---->"+empList.stream().max((t1,t2)->(t1.getEmpSal()<t2.getEmpSal())?-1:(t1.getEmpSal()==t2.getEmpSal())?0:1).get());
		System.out.println("Min Emp Salary ::---->"+empList.stream().max((t1,t2)->(t1.getEmpSal()<t2.getEmpSal())?1:(t1.getEmpSal()==t2.getEmpSal())?0:-1).get());
		Employee e2 = empList.stream().max((t1,t2)->(t1.getEmpSal()<t2.getEmpSal())?-1:(t1.getEmpSal()==t2.getEmpSal())?0:1).get();
		System.out.println(e2.getEmpName()+"   Max salary is  "+e2.getEmpSal());
		Employee e3 = empList.stream().min((t1,t2)->(t1.getEmpSal()<t2.getEmpSal())?-1:(t1.getEmpSal()==t2.getEmpSal())?0:1).get();
		System.out.println(e3.getEmpName()+"   min salary is  "+e3.getEmpSal());
		
		//write a program to collect all the ids into separate list from empList
		List<Integer> listofId = empList.stream().map((re)->re.getEmpId()).collect(Collectors.toList());
		System.out.println(listofId);
		
		
		//write a program to print employee name whoose name startes with k
		for (int i = 0; i < empList.size(); i++)
		{
			if(validate(empList.get(i).getEmpName()))
				System.out.println(empList.get(i).getEmpName());
		}
		System.out.println("code with stream");
		empList.stream().filter((r)->r.getEmpName().startsWith("k")).forEach((t)->System.out.println(t.getEmpName()));
		System.out.println(" output ::" +empList.stream().filter((r)->r.getEmpName().startsWith("k")));
		
		//write a program to collect emp nos into separate List from EmpList
		List<String> empList1 = empList.stream().map((t)->t.getEmpName()).collect(Collectors.toList());
		System.out.println("emp name using stream" +empList1);
		System.out.println("map method output ::"+empList.stream().map((t)->t.getEmpName()));
		
		//Intermediate operation and terminal operations
		//filter
		//map
		//Terminal operation--forEach,Collect
		
		//Intermediate operation does not provide any out put unless and untill terminal operation is done.
		
		/*
		List<String> s1 = new ArrayList<String>();
		s1.add("kousav");
		s1.add("Vaibhav");
		
		s1.stream().filter((g)->)*/
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(15);
		numbers.add(20);
		numbers.add(30);
		numbers.add(45);
		numbers.add(45);
		numbers.add(55);
		numbers.add(55);
		numbers.add(55);
		
	
		
		//remove the duplicates 
		System.out.println("Duplicates REVOVAL :: " +numbers.stream().distinct());
		//System.out.println("Duplicates REVOVAL :: " +numbers.stream().distinct());
		numbers.stream().distinct().forEach((o)->System.out.println(o));
		
		//number of duplicated elements
		int duplicateElementCount = (int) (numbers.size()-numbers.stream().distinct().count());
		System.out.println("Duplicate Count ::"+duplicateElementCount);
		
		//numbers.stream().filter((gf)->(gf%2==0)).forEach(gfd->System.out.println(gfd));
		Set<Integer> s1 = numbers.stream().filter((gf)->(gf%2==0)).collect(Collectors.toSet());
		
		//Write a program to sort the list of number
		System.out.println("Sortted Numbers ------------------>"+numbers.stream().sorted().collect(Collectors.toList()));
		//Write a program to sort the list of number
		System.out.println("Sortted Numbers in decending order------------------>"+numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));
		
		
		//write a program to print min number from the given list
		System.out.println("Minimum Number" +numbers.stream().min((x,y)->(x < y) ? -1 : ((x == y) ? 0 : 1)).get());
		System.out.println("Minimum Number" +numbers.stream().max((x,y)->(x < y) ? -1 : ((x == y) ? 0 : 1)).get());
		
	}
	
	
	private static boolean validate(String empName)
	{
		if(empName.startsWith("k"))
			return true;
		else
		return false;
	}
}
