package com.array1;
//Read only odd indexed element in the aarray in reverse order
public class V3
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,40,30,50,60,70,90};
		int end = arr.length%2==0?arr.length-1:arr.length;
		for(int i=end;i>=1;i-=2)
		{
			System.out.print(arr[i]+" ,");
		}
	}

}
