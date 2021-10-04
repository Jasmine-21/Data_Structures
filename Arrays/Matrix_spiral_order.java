package Arrays;

import java.util.Scanner;

public class Matrix_spiral_order {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
int a[][]=new int[m][n];
for(int i=0;i<m;i++)
{
	for(int j=0;j<n;j++)
	{
		a[i][j]=sc.nextInt();
	}
}
int r1=0;
int r2=m-1;
int c1=0;
int c2=n-1;
while(r1<=r2&&c1<=c2)
{
	// To display top row
	for(int j=c1;j<=c2;j++)
	{
		System.out.print(a[r1][j]+" ");
	}
	// To display right most column
	r1++;
	for(int i=r1;i<=r2;i++)
	{
		System.out.print(a[i][c2]+" ");
	}
	// To display left most column
	c2--;
	for(int j=c2;j>=c1;j--)
	{
		System.out.print(a[r2][j]+" ");

	}
	// To display bottom row
	r2--;
	for(int i=r2;i>=r1;i--)
	{
		System.out.print(a[i][c1]+" ");

	}
	c1++;
}
System.out.println();
	}
}
