//print odd and even Thread using 

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenAndOdd
{
	private static Object object = new Object();
	
	private static IntPredicate evenPredicate = i->i%2==0;
	private static IntPredicate oddPredicate = i->i%2!=0;
	
	public static void main(String[] args) throws InterruptedException
	{
		CompletableFuture.runAsync(()->EvenAndOdd.printResults(oddPredicate));
		CompletableFuture.runAsync(()->EvenAndOdd.printResults(evenPredicate));
		Thread.sleep(1000);
	}
	public static void printResults(IntPredicate condition)
	{
		IntStream.rangeClosed(1, 10).filter(condition).forEach(EvenAndOdd::execute);
		
	}
	
	
	public static  void execute(int i)
	{
		synchronized (object)
		{
			System.out.println(Thread.currentThread().getName()+"------ "+i);
			try
			{
				object.notify();
				object.wait();
			} catch (InterruptedException e)
			{
				//
			}
		}
	}

}
