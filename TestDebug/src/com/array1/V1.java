package com.array1;
//Read only even indexed element in reverse order
public class V1
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,40,30,50,60,70,70};
		int end = arr.length%2==0?arr.length-2:arr.length-1;
		for(int i=end;i>=0;i-=2)
		{
			System.out.print(arr[i]+" ,");
		}
	}

}
