import java.util.Arrays;

public class RightRotatebyOne
{
	public static void main(String[] args)
	{
		int arr[]= {10,20,30,40,50};
		System.out.println(Arrays.toString(arr));
		int x=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=x;
	
		System.out.println(Arrays.toString(arr));
	}

}
