/*
	53. remove all occurances of specified element from the given array ?
*/

class Q53
{
	public static void main(String[] args) 
	{
		int[] x ={5, 10, 10, 3, 10, 10, 10, 10, 10, 10};
		        //0   1  2  3  4   5  6  7  8 9
		// remove element 10
		System.out.println("Initial array content");
		for(int i =0; i< x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();
		int occurances = 0;
		for(int i =0; i < x.length- occurances; i++)
		{
			if(x[i] == 10)
			{
				for(int j=i; j< x.length-1; j++)
				{
					x[j] = x[j+1];
				}
				occurances++;
				i--;
			}
		}
		int[] y = new int[x.length - occurances];
		for(int i= 0; i < y.length; i++)
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
