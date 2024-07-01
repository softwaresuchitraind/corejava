/*
	59. Removing elements of one array from another ?
*/

class Q59
{
	public static void main(String[] args) 
	{
		int[] x ={5, 2, 8, 3, 20, 11,  7, 18, 10};
		        //0   1  2  3  4   5  6  7  8 9

		int[] y = {5, 8, 9 , 3 ,20 , 7 , 13};
				// 0   1  2   3  4   5    6
		System.out.println("Initial x array content");
		for(int i =0; i< x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();
		
		System.out.println("Initial y array content");
		for(int i =0; i< y.length; i++)
		{
			System.out.print(y[i] + ", ");
		}
		System.out.println();
		//remove y array from x array
		int count = 0;
		for(int i = 0; i< y.length; i++)
		{
			for(int j = 0; j< x.length - count; j++)
			{
				if(y[i] == x[i])
				{
					for(int k =j; k < x.length-count-1; k++)
					{
						x[k] =x[k+1];
					}
					j--;
					count++;
				}
			}
		}
		int[] z = new int[x.length - count];
		for(int i = 0; i< z.length; i++)
		{
			z[i] = x[i];
		}
		System.out.println("final array content");
		for(int i = 0; i < z.length; i++)
		{
			System.out.print(z[i] + ", ");
		}

		
	}
}
