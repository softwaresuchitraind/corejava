package com.array1;
//Read even indexed element of an Array
public class V
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,40,30,50,60,70,70};
		for(int i=0;i<arr.length;i+=2)
		{
			System.out.print(arr[i]+" ,");
		}
	}

}
