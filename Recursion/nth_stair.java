package Recursion;

import java.util.*;
// Count ways to reach the nth stair using step 1, 2 or 3
//using Recursive Method
public class nth_stair {
public static int count_stairs(int n)
{
if(n==1 ||n==0)
	return 1;
else if(n==2)
	return 2;
else
	return count_stairs(n-3)+count_stairs(n-2)+count_stairs(n-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.print(count_stairs(n));
	}

}
