package java8;

import java.util.ArrayList;
import java.util.List;

public class M17
{
	public static void main(String[] args)
	{
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(41,"john"));
		list.add(new Employee(5,"john"));
		list.add(new Employee(9,"john"));
		list.add(new Employee(4,"john"));
		
		list.forEach(e->System.out.println(e.age+ "Employee" +e.name));
	}
}
