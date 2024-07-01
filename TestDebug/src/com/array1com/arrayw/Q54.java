/*
	54. remove range of  element from the given array ?
*/

class Q54
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
		//remove elements from index 4 to 7
		int fromIndex = 4, toIndex = 7;
		int elementsCount = toIndex - fromIndex;
		for(int i = fromIndex; i < x.length - elementsCount; i++)
		{
			x[i] = x[i + elementsCount];
		}
		int[] y = new int[x.length - elementsCount];
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
