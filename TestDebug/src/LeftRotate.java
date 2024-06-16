import java.util.Arrays;

public class LeftRotate
{
	public static void main(String[] args)
	{
		int arr[]= {10,20,30,40,50};//5
		System.out.println(Arrays.toString(arr));
					//0,1,2,3,4
		int x= arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];//20,30,40,50,50
		}
		arr[arr.length-1]=x;
		System.out.println(Arrays.toString(arr));
	}
}
