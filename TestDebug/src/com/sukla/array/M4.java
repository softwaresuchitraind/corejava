package com.sukla.array;
/*
 * Finding missing elemets of an array[1-10]
 * 
 * o/p-4
 * o/p-3
 * 
 * */
public class M4
{
	public static void main(String[] args)
	{
		int ar[] = new int[] {1,2,6,7,8,9,10,4,3};
		int res=m1(ar);
		System.out.println(res);
	}

	private static int m1(int[] ar)
	{
		
		
		for(int num=1;num<=10;num++)
		{
			boolean flag = false;
			for(int i=0;i<9;i++)
			{
				if(ar[i]==num)
				{
				flag=true;
				break;
				}
			}
			
			if(flag==false)
				return num;
		}
		return 0;
	
	}
}
