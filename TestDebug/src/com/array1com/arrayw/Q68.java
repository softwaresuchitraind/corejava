/*
68. Combine two arrays and develop a third array ?
Consider element by element while combining
*/

class Q68
{
	public static void main(String[] args) 
	{
		int[] x = {5, 2, 5, 4, 4, 4, 10, 3, 10, 5};
				// 0   1  2  3  4  5  6  7   8  9  

		int[] y = {8, 0, 3, 1, 6};
				// 0  1  2  3  4 
		System.out.println("x array content");
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();
		int length= x.length +y.length;
		int [] z = new int[length];
		for(int i = 0, j = 0, k = 0; i < z.length;)
		{
			if(j < x.length)
			{
				z[i ++] = x[j ++];
			}
			if(k < y.length)
			{
				z[i++] = y[k ++];
			}
		}
		System.out.println("z array content");
		for(int i = 0; i < z.length; i++)
		{
			System.out.print(z[i] + ", ");
		}
		
	}

}
