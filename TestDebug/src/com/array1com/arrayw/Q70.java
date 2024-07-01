/*
70. Sorting int elements from an arrays?
(use bubble sort)

*/

class Q70
{
	public static void main(String[] args) 
	{
		int[] x = {5, 2, 5, 4, 4, 4, 10, 3, 10, 5, 9, 7};
				// 0   1  2  3  4  5  6  7   8  9  

		System.out.println("x array content");
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();
		for(int i = 0; i< x.length; i++)
		{
			for(int j = 0; j< x.length-i-1; j++)
			{
				if(x[j] > x[j+1])
				{
					x[j] = x[j] + x[j+1];
					x[j+1] = x[j] - x[j+1];
					x[j] = x[j] - x[j+1];
				}
			}
		}
		System.out.println("final array content");
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		
	}

}

/*



*/
