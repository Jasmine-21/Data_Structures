package arrays;

import java.util.Scanner;

public class AverageMarksOfStudents {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of students : ");
		
		int size=sc.nextInt();
		
		int marks []=new int [size];
		
		System.out.println("Enter marks: ");
		
		for(int i=0;i<size;i++) {
			
			marks[i]= sc.nextInt();
		}
		float avgMarks=0;
		for(int i=0;i<size;i++) {
			avgMarks+=marks[i];
		}
		
		avgMarks/=(float)size;
		System.out.println("The average marks are: "+avgMarks);

	}

}
