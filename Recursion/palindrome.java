package Recursion;
import java.util.*;
public class palindrome {
	 public static boolean isPal(String str)
	 {
		 if(str.length() == 0 || str.length() == 1)
	            return true; 
	        if(str.charAt(0) == str.charAt(str.length()-1))
	        	return true;
//	       return isPal(str.substring(1, str.length()-1));
	        return false;
	    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String for check:");
        String string = scanner.nextLine();
        if(isPal(string))
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");
	}

}
