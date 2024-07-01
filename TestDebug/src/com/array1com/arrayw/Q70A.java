/*
even indexed elements sorting in ascending order
odd indexed elements sorting in the descending order
(use bubble sort)

*/

class Q70A
{
	public static void main(String[] args) 
	{
		int[] x = {5, 2, 5, 4, 4, 4, 10, 3, 10, 5, 9};
				// 0   1  2  3  4  5  6  7   8  9  

		System.out.println("x array content");
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();

		//even indexed elements sorting in the ascending order
		for(int i = 0; i< x.length - 1 ; i +=2)
		{
			for(int j = 0; j< x.length - i - 2; j +=2)
			{
				if(x[j] > x[j+2])
				{
					x[j] = x[j] + x[j+1];
					x[j+2] = x[j] - x[j+2];
					x[j] = x[j] - x[j+2];
				}
			}
		}
		
		// odd indexed elements sorting in the descending order
		for(int i = 1; i< x.length - 1 ; i +=2)
		{
			for(int j = 1; j< x.length - i - 2; j +=2)
			{
				if(x[j] <  x[j+2])
				{
					x[j] = x[j] + x[j+1];
					x[j+2] = x[j] - x[j+2];
					x[j] = x[j] - x[j+2];
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
