package in.suklak.concurrent;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class WhynotFuture
{
	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		ExecutorService service =Executors.newFixedThreadPool(10);
		Future<List<Integer>> future1 = service.submit(()->{
			//you doing api call
			System.out.println("Thread : "+ Thread.currentThread().getName());
			
			return Arrays.asList(1,2,3,4);
			
		});
		Future<List<Integer>> future2 = service.submit(()->{
			//you doing api call
			System.out.println("Thread : "+ Thread.currentThread().getName());
			
			return Arrays.asList(1,2,3,4);
			
		});
		Future<List<Integer>> future3 = service.submit(()->{
			//you doing api call
			System.out.println("Thread : "+ Thread.currentThread().getName());
			
			return Arrays.asList(1,2,3,4);
			
		});
		
		List<Integer> list = future1.get();
		System.out.println(list);
		
	}
	
	private static void delay(int min)
	{
		try
		{
			TimeUnit.MINUTES.sleep(min);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

/*
 * multiple future can not be chanined together
 * we can not combine multiple future together
 * submit(Callable)
 * execute(Runnable)
 * */
