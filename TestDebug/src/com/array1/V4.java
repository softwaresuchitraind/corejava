package com.array1;
//Find out index of a specified element
public class V4
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40,50,60,70};
		int index = -1;
		int element = 40;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
			{
				index =i;
				break;
			}
		}
		if(index==-1)
		{
			System.out.println("The"+element+"is not found");
		}
		else
		{
			System.out.println("The "+element+" is  found at "+index);
		}
	}

}
