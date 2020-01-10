package Recursion;
import java.util.*;
public class practice {
public static void number1(int n)
{
	//print elements before 0
	System.out.print(n+" ");
	if(n<=0)
		return ;
	number1(n-5);
	//print elements After 0
	System.out.print(n+" ");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
number1(n);
	}

}
