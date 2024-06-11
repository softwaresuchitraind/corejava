/*Sum of two numbers using Lamda Expression*/
@FunctionalInterface
interface Sum
{
	int add(int a,int b);
}

public class M1 
{
	public static void main(String[] args)
	{
		Sum s1 = (a,b)->a+b;
		int i=s1.add(10, 20);
		System.out.println(i);
	}

}
