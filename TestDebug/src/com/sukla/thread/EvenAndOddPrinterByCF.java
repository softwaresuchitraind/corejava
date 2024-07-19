package com.sukla.thread;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenAndOddPrinterByCF
{
	private static Object object = new Object();
	
	private static IntPredicate evenCondition=e->e%2==0;
	private static IntPredicate oddCondition=e->e%2!=0;
	
	public static void main(String[] args) throws InterruptedException
	{
		CompletableFuture.runAsync(()->EvenAndOddPrinterByCF.printResult(oddCondition));
		CompletableFuture.runAsync(()->EvenAndOddPrinterByCF.printResult(evenCondition));
		Thread.sleep(1000);
	}
	
	public static void printResult(IntPredicate condition)
	{
		IntStream.rangeClosed(1, 10)
					.filter(condition)
					.forEach(EvenAndOddPrinterByCF::execute);
	}

	public static void execute(int i)
	{
		synchronized (object)
		{
			System.out.println("Thread Name "+Thread.currentThread().getName()+" :"+i);
			try 
			{
				object.notify();
				object.wait();
			}
			catch (InterruptedException e) {
				//error log
			}
		}
	}

}
