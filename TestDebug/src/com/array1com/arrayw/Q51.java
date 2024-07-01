/*
	51. Remove specified indexed element from the given array ?
*/

class Q51 
{
	public static void main(String[] args) 
	{
		int[] x ={5, 2, 8, 3, 10, 6, 1, 7, 0, 4};
		        //0   1  2  3  4   5  6  7  8 9
		// remove element from index 4.
		for(int i =0; i< x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();
		for(int i = 4; i< x.length -1; i++)
		{
			x[i] = x[i+1];
		}
		int []y = new int[x.length -1];
		for(int i =0; i< y.length; i++)
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
