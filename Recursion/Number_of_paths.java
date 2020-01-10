package Recursion;
import java.util.*;
// 3 3 matrix
//A B C
//D E F
//G H I
// paths end 'I' ,start 'A'  :
public class Number_of_paths {
public static int path(int m,int n)
{
	if(m==1 ||n==1)
		return 1;
	else
		return path(m-1,n)+path(m,n-1);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
System.out.println(path(m,n));
	}

}
