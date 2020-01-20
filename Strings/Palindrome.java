package Strings;

public class Palindrome {

	public static boolean pal(String s)
	{
		
		int i=0;
		int j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="madam";
if(pal(s))
{
	System.out.print("paindrome");
}
else
{
	System.out.print("paindrome");
	
}
	}

}
