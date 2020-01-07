package Arrays;
/*
 * Jagged array is array of arrays such that member arrays can be of different sizes, i.e.,
 *  we can create a 2-D arrays but with variable number of columns in each row. 
 *  These type of arrays are also known as Jagged arrays.
 */
public class Sum_Of_two_Jagged_Array {
public static void main(String[] args) {
	int r = 5; 
    int arr[][] = new int[8][]; 
 // Creating a 2D array such that first row 
    // has 1 element, second row has two  
    // elements and so on.
    for (int i=0; i<arr.length; i++) 
        arr[i] = new int[i+1]; 
    int count = 0; 
    for (int i=0; i<arr.length; i++) 
        for(int j=0; j<arr[i].length; j++) 
            arr[i][j] = count++; 
    System.out.println(" 2D Jagged Array"); 
    for (int i=0; i<arr.length; i++) 
    { 
        for (int j=0; j<arr[i].length; j++) 
            System.out.print(arr[i][j] + " "); 
        System.out.println(); 
    } 
	}
}
