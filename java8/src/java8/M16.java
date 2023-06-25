package java8;

import java.util.ArrayList;
import java.util.List;

public class M16
{
	public static void main(String[] args)
	{
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(41,"john"));
		list.add(new Employee(5,"john"));
		list.add(new Employee(9,"john"));
		list.add(new Employee(4,"john"));
		
		for (Employee e : list)
		{
			System.out.println(e.age +" Employee " +e.name);
		}
	}
}
