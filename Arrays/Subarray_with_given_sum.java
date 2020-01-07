package Arrays;

import java.util.*;
public class Subarray_with_given_sum {

	/*
	 * Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
		Ouptut: Sum found between indexes 2 and 4
		Input: arr[] = {1, 4}, sum = 0
		Output: No subarray found
	 */
	
	
	
	/*Time Complexity : O(n^2) in worst case. */
//		int subArray(int arr[],int n,int sum)
//		{
//			int i,j,temp;
//			for(i=0;i<n;i++)
//			{
//				temp=arr[i];
//				for(j=i+1;j<=n;j++)
//				{
//				if(temp==sum)
//				{
//					int m=j-1;
//					System.out.println("Sum found between indexes " + i  + " and " + m); 
//                    return 1; 
//				}
//				if(temp>sum ||j==n)
//				{
//					break;
//					
//				}
//				temp=temp+arr[j];
//				}
//				
//			}
//			return 0;
//		}
	
	
//	Time Complexity : O(n) 
	int subArray(int arr[], int n, int sum)  
    { 
        int temp= arr[0];
        int start = 0;
        int i; 
        for (i = 1; i <= n; i++)  
        { 
             
            while (temp > sum && start < i-1) 
            { 
                temp = temp - arr[start]; 
                start++; 
            } 
            if (temp== sum)  
            { 
                int m = i-1; 
                System.out.println("Sum found between indexes " + start 
                        + " and " + m); 
                return 1; 
            } 
            if (i < n) 
            temp=temp + arr[i]; 
              
        } 
  //if no subarray found
        System.out.println("No subarray found"); 
        return 0; 
    } 
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Subarray_with_given_sum arraysum = new Subarray_with_given_sum();
		Scanner sc=new Scanner(System.in);
		  int n = sc.nextInt(); 
		int arr[] = new int[n]; 
      for(int i=0;i<n;i++)
      {
    	  arr[i]=sc.nextInt();
      }
        int sum = sc.nextInt(); 
        arraysum.subArray(arr, n, sum); 
	}
	
}
