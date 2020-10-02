package Recursion;
//0 1 1 2 3 5 8 13 21 34 55
public class Fibonacci {
	static int print(int n)
	{
		if(n<=1)
			return n;
		//print(n-1)+print(n-2);
		return print(n-1)+print(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print(print(13));
	}

}
