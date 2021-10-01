package Recursion;
import java.util.*;
// 3 3 matrix
//A B C
//D E F
//G H I
// paths end 'I' ,start 'A'  :
public class Number_of_paths {
public static int path(int y,int t)
{
	if(y==1 ||t==1)
		return 1;
	else
		return path(y-1,t)+path(y,t-1);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int y=sc.nextInt();
int t=sc.nextInt();
System.out.println(path(y,t));
	}

}
