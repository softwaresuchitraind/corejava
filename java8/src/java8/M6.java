package java8;

public class M6
{
	public static void main(String[] args)
	{
		Runnable run = () ->
		{
			Thread.currentThread().setName("MyThread");
			System.out.println(Thread.currentThread().getName() +"  is running");
		};
		Thread t1 = new Thread(run);
		t1.start();
	}
}
