package Recursion;
import java.util.*;
public class Sum_Triangle {

	static void sum_triangle(int arr[])
	{
		if(arr.length<1)
			return;
		int arr2[]=new int [arr.length-1];
		for(int i=0;i<arr.length-1;i++)
		{
			int a=arr[i]+arr[i+1];
			arr2[i]=a;
		}
		sum_triangle(arr2);
				System.out.println(Arrays.toString(arr));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5};
sum_triangle(arr);
	}

}
