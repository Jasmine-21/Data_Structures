package Recursion;
import java.util.*;
public class Sum_Triangle {

	static void sum_triangle(int array[])
	{
		if(array.length<1)
			return;
		int array2[]=new int [array.length-1];
		for(int i=0;i<arr.length-1;i++)
		{
			int a=array[i]+array[i+1];
			array2[i]=a;
		}
		sum_triangle(array2);
				System.out.println(Arrays.toString(array));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5};
sum_triangle(arr);
	}

}
