package Arrays;
import java.util.*;
public class Find_Missing_Number {

	/*
	 * Time Complexity-O(n)
	 */
	public static int missiongNumber(int a[],int n)
	{
		//sum=n(n+1)/2; as we have to find missiong number so size of arrayy will be increased
		int total=(n+1)*(n+2)/2;
		for(int i=0;i<n;i++)
		{
			total=total-a[i];
		}
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
int res=missiongNumber(arr,n);
System.out.print(res);
	}

}
