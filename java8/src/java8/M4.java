package java8;
@FunctionalInterface
interface Add
{
	void addTwoNumbers(int a, int b);
}
public class M4 
{

	public static void main(String[] args)
	{
		Add add= (a,b)->System.out.println("Sum of two numbers :: " + (a+b));
		add.addTwoNumbers(10, 20);
			
		
		
	}
	
	
}
