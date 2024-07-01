package com.sukla.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class EvenAndOddPrinterByEs
{
	public static void main(String[] args)
	{
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		IntStream.rangeClosed(1, 10).forEach(num-> 
		{
			
			CompletableFuture<Integer> oddcompletableFyture = CompletableFuture
					.completedFuture(num)
					.thenApplyAsync(x->{
						if(x%2!=0)
						{
							System.out.println("Thread Name"+Thread.currentThread().getName()+" "+x);
						}
						return num;
					},executorService);
			oddcompletableFyture.join();

			CompletableFuture<Integer> evencompletableFyture = CompletableFuture
					.completedFuture(num)
					.thenApplyAsync(x->{
						if(x%2==0)
						{
							System.out.println("Thread Name"+Thread.currentThread().getName()+" "+x);
						}
						return num;
					},executorService);
			evencompletableFyture.join();
		});
		executorService.shutdown();
		
	}

}
