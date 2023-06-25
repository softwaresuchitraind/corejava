package java8;
interface MyRef
{
	void m1();
}
public class M13
{
	static void m2()
	{
		System.out.println("m2 called");
	}
	public static void main(String[] args)
	{
		MyRef myref = M13::m2;
		myref.m1();
	}
}
