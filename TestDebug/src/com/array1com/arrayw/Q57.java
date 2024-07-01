/*
	57. remove duplicates from the given array ?
*/

class Q57
{
	public static void main(String[] args) 
	{
		int[] x ={5, 2, 5, 3, 2, 2, 1, 7, 7, 7};
		        //0   1  2  3  4   5  6  7  8 9
		System.out.println("Initial array content");
		for(int i =0; i< x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();
		// remove all duplicate elements
		int count = 0;
		for(int i =0; i<x.length-count;i++)
		{
			for(int j = i+1; j < x.length-count; j++)
			{
				if(x[i] == x[j])
				{
					for(int k = j; k < x.length-count-1; k++)
					{
						x[k] = x[k+1];
					}
					count++;
					j--;
				}
			}
		}
		int []y = new int[x.length-count];
		for(int i =0; i< y.length; i++)
		{
			y[i] =x[i];
		}
		System.out.println("final array content");
		for(int i = 0; i < y.length; i++)
		{
			System.out.print(y[i] + ", ");
		}
		System.out.println();
	}
}
