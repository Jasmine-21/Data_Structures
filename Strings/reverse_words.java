package Strings;
import java.util.*;
public class reverse_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		    String s=sc.nextLine();
		    String sd[]=s.split("\\.");
		    String ans="";
		   for(int i=sd.length-1;i>0;i--){
			   ans+=sd[i]+".";
		    }
		   ans+=sd[0];
		    System.out.print(ans);
	}
}
