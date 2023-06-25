package java8;

public class M14
{
	public void test()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("from test");
		}
	}
	public static void main(String[] args)
	{
		M14 m = new M14();
		Runnable r = m::test;
		Thread t = new Thread(r);
		t.start();
		
		for(int j=0;j<=5;j++)
		{
			System.out.println("from main Thread");
		}
	}
}
