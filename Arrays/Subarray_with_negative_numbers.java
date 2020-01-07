package Arrays;

import java.util.*;

public class Subarray_with_negative_numbers {

void subArray(int arr[],int n,int sum)
	{
		int temp=0;
		int start=0;
		int end=-1;
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			temp=temp+arr[i];
			if(temp-sum==0)
			{
				start=0;
			end=i;
			break;
			}
		if(hm.containsKey(temp-sum))
		{
			start=hm.get(temp-sum)+1;
			end=i;
			break;
		}
		//if value is not present then add to hashmap 
        hm.put(temp, i); 
		}
		if (end == -1) { 
            System.out.println("No subarray with given sum exists"); 
        } else 
        { 
            System.out.println("Sum found between indexes " 
                            + start + " to " + end); 
        } 
  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subarray_with_negative_numbers arraysum = new Subarray_with_negative_numbers();
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
