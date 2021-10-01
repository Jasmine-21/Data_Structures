package Strings;
import java.util.*;
public class reverse_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		    String s=sc.nextLine();
		    String spli[]=s.split("\\.");
		    String ans="";
		   for(int i=spli.length-1;i>0;i--){
			   ans+=spli[i]+".";
		    }
		   ans+=spli[0];
		    System.out.print(ans);
	}
}
