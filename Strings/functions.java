package Strings;

public class functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String(String obj)
		String s1 = "India";
		String s2 = new String(s1);
		System.out.println(s2); //India 

		//String(char[ ] array)
		char array[ ] = {'j','a','v','a'};
		String ss = new String (array);
		System.out.println(ss);//Java

		//String(char[ ] ary, int startIndex, int count)
		char[ ] ary = {'J','a','s','m','i','n','e'};
		String st = new String (ary, 2, 4);
		System.out.println(st); //smin

		//		String(byte[ ]ary, int startIndex, int count)
		//		byte [] b = {65, 66, 67, 68};
		//		String s = new String (b, 1,2);
		//		System.out.println(); //BC


		String S1 = "MST";
		String S11 = S1.toLowerCase( );
		System.out.println (S1 == S11); // false
		String S22 = S1.toUpperCase( );
		System.out.println(S1 == S22); //  true

		//String[] split(String regExp)=This method returns an array of String objects 
		//on the basis of regular expression pattern (regExp) passed as argument.
		String s = "Hello Java Hello Programmers";
		String[] sa = s.split("\\.");
		for (String v : sa)
		System.out.print(v+" "); //Hello Java Hello Programmers 
	System.out.println();
		
		String S = "Java";
		int l = S.length();
		System.out.println(l); // 4
		
		//int indexOf(int character)
//		int indexOf(int character, int startIndex)
		String aa = "Real Java";
		int indx = s.indexOf('a', 3);
		System.out.println(indx); // 6
//		This method returns the index of first 
//		occurrence of the character passed as argument. It returns -1 if the character is not presented in the string.
		String sss = "Real Java";		
		int index = sss.indexOf('a');
		System.out.println(index); // 2
		
		
//		int indexOf (String str)
//		int indexOf(String str, int startIndex)
//		The first method starts search of 
//		argument string from zero index, whereas second method starts searching from specifi ed startIndex.
		String kl = "Step by Step";
		int indx1 = kl.indexOf("Step");
		System.out.println(indx1); // 0
		int indx2 = kl.indexOf("Step", 2);
		System.out.println(indx2); // 8
		 
	
		String zx = "Sun-Soft Technologies";
		String kasd = zx.substring(4);
		System.out.println(kasd); // Soft}

		String ssd = "India";
		char ch = s.charAt(2);
		System.out.println(ch); //d
		
		String jk = "James Gosling";
		System.out.println(jk.isEmpty());  
		
		
//		int compareTo(String object)
//		This method compares the contents of invoking string object with the string object passed as argument. 
//		Characters are compared lexicographically. It returns a value +ve, -ve zero.
//		 The zero(0) value means both strings are same.
//		 The +ve value means that the invoking object is lexicographically greater than the other string
//		 The -ve value means that the invoking string object is lexicographicall less than the other string object.
		String sa1 ="ABCDE";
		String sa2 = "BC";
		int v1 = sa1.compareTo(sa2);
		System.out.println(v1); // -1 
		
		
		
//		boolean equals (Object obj)
//		The equals()method is a member of java.lang.Object class. It basically checks the reference equality 
//		but java.lang.Stringclass override this method for content equality.
//		If the contents are same than it returns true else false.
		
		
//		String replace(char existingChar, char newChar)
		String szx ="Banglore";
		String szzz1 = szx.replace('a','A');
		System.out.println(szzz1); // BAnglore
		
		String abc = "BANGLORE COMP. EDUCATION";
		String def = abc.replaceAll("[AEO]", "*");
		System.out.println(def); // B*NGL*R* C*MP. *DUC*TI*N
		
		
}}
