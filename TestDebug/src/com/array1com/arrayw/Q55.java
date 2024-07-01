/*
	55. remove all odd indexed element from the given array ?
*/

class Q55
{
	public static void main(String[] args) 
	{
		int[] x ={5, 2, 8, 3, 10, 6, 1, 7, 0, 4};
		        //0   1  2  3  4   5  6  7  8 9
		System.out.println("Initial array content");
		for(int i =0; i< x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();
		// remove all odd indexed element
		int min = x[0];
		for(int i =1; i< x.length ; i++)
		{
			if(x[i] < min)
			{
				min= x[i];
			}
		}
		for(int i=1; i< x.length; i++)
		{
			if(i % 2 == 1)
			{
				x[i] = min-1;
			}
		}
		int occurances = 0;
		for(int i =1; i< x.length - occurances; i++)
		{
			if(x[i] == (min-1))
			{
				for(int j=i; j< x.length-occurances-1;j++)
				{
					x[j] = x[j+1];
				}
				occurances++;
			
			}
		}
		int [] y = new int[x.length - occurances];
		for(int i=0; i< y.length; i++)
		{
			y[i] = x[i];
		}
		System.out.println("final array content");
		for(int i = 0; i < y.length; i++)
		{
			System.out.print(y[i] + ", ");
		}
		System.out.println();
	}
}
