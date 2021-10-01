package Recursion;

import java.util.*;
// Count ways to reach the nth stair using step 1, 2 or 3
//using Recursive Method
public class nth_stair {
public static int count_stairs(int h)
{
if(h==1 ||h==0)
	return 1;
else if(h==2)
	return 2;
else
	return count_stairs(h-3)+count_stairs(h-2)+count_stairs(h-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.print(count_stairs(n));
	}

}
