package in.suklak;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class M1
{
	public static void main(String[] args)
	{
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		System.out.println(l);
		for(int i=0;i<l.size();i++)
		{
			System.out.println(" ");
			System.out.println(l.get(i));
		}
		System.out.println("printing the list with java 8");
		//Consumer<Integer> c =(x)->System.out.println(x);
		l.forEach((x)->{
		System.out.println(" ");
		System.out.println(x);
		});
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(123,"suchitra",10000));
		empList.add(new Employee(124,"Aditya",20000));
		empList.add(new Employee(125,"Atul",30000));
		empList.add(new Employee(126,"Vaibhav",40000));
		empList.add(new Employee(127,"Shesha",50000));
		
		for (int i = 0; i < empList.size(); i++)
		{
			System.out.println("Emp Id is"+empList.get(i).getEmpId() + " Emp Name is"+empList.get(i).getEmpName());
		}
		empList.forEach((v)->{
		double sal = v.getEmpSal();
		double deductedSal=sal*0.01;
		System.out.println("EmpzId is" +v.getEmpId()+ "Employee Name is" +v.getEmpName()+" Deducted Salary is"+deductedSal);
		
		});
		empList.removeIf(p->p.getEmpName().startsWith("k"));
		
	}
}
