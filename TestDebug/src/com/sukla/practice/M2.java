package com.sukla.practice;

import java.util.Scanner;

/**
 * Calculate Simple and compond intertest
 * */
public class M2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter principal :: ");
		double principal = sc.nextDouble();
		System.out.println("Please enter time");
		double time = sc.nextDouble();
		System.out.println("Please enter rate");
		double rate = sc.nextDouble();
		
		double simpleInterest= (principal*time*rate)/100;
		System.out.println("Simple Interest ::" +simpleInterest);
		
		double compoundInterest= principal*Math.pow((1+rate/100), time)-principal;
		System.out.println("Compouund Interest :: "+compoundInterest);
		
	}
}
