/*
67. Find out element frequency in the given array ?
*/

class Q67 
{
	public static void main(String[] args) 
	{
		int[] x = {5, 2, 5, 4, 4, 4, 10, 3, 10, 5, 6, 1, 6};
				// 0   1  2  3  4  5  6  7   8  9  10 11  12
		System.out.println("x array content");
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();
		outer:
		for(int i = 0; i< x.length; i++)
		{
			int count = 0;
			for(int j=0; j< x.length; j++)
			{
				if(x[i] == x[j])
				{
					count++;
				}
			}
			for(int k = 0; k < i; k++)
			{
				if(x[i] == x[k])
				{
					continue outer;
				}
			}
			System.out.println(x[i]+ ":" +count);
		}
	}

}
