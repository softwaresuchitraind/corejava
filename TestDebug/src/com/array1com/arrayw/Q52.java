/*
	52. update specified indexed element with a new element from the given array ?
*/

class Q52
{
	public static void main(String[] args) 
	{
		int[] x ={5, 2, 8, 3, 10, 6, 1, 7, 0, 4};
		        //0   1  2  3  4   5  6  7  8 9
		// update the element from index 4 with 50
		for(int i =0; i< x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();
		x[4] = 50;
		System.out.println("final array content");
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();
	}
}
