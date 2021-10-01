package Strings;
//check if string can be found by rotating another string by 2 places
//I/P=student,udentst   O/P=true;
//I/P=facebook,okfacebo O/P=true;
//I/P=Sehaj,jseha O/P=false
import java.util.*;
public class rotation_another_string {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       System.out.print("str1:");
	       String s1=sc.next();
	       System.out.print("str2:");
	       String s2=sc.next();
	         String answer1="";//clock
	         String ans2="";//anticlock
	         int l=s1.length();
	         if(s1.length()!=s2.length())
	        	 System.out.print("no");
	         answer1=answer1+s1.substring(2)+s1.substring(0,2);
	         ans2=ans2+s1.substring(l-2,l)+s1.substring(0,l-2);
	         if(s2.equals(answer1)|| s2.equals(ans2)) 
	        	 System.out.print("yes");
	         else 
	        	 System.out.print("no");
	}

}
