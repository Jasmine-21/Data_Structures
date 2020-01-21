package Strings;
import java.util.*;
import java.util.Arrays; 

public class Anagram {

	public static boolean areAnagram(char[] s3,char[] s4)
	{
		int n1=s3.length;
		int n2=s4.length;
		if(n1!=n2)
		{
			return false;
		}
		Arrays.sort(s3);
		Arrays.sort(s4);
		for(int i=0;i<n1;i++)
		{
			if(s3[i]!=s4[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
String str1=sc.nextLine();
char s3[]=str1.toCharArray();
String str2=sc.nextLine();
char s4[]=str2.toCharArray();
if (areAnagram(s3, s4)) 
    System.out.println(" anagram "); 
else
    System.out.println("Not anagram "); 
	}

}
