package Arrays;
/*
 * Jagged array is array of arrays such that member arrays can be of different sizes, i.e.,
 *  we can create a 2-D arrays but with variable number of columns in each row. 
 *  These type of arrays are also known as Jagged arrays.
 */
public class Sum_Of_two_Jagged_Array {
	public static void main (String args[])
    {
        int count=0;
        int a[][]=new int[5][];
        int b[][]=new int[5][];
        int c[][]=new int[5][];
        for(int i=0;i<5;i++) 
        {
            a[i]=new int [i+1];
            b[i]=new int [i+1];
            c[i]=new int [i+1];
        } 
        //rows
        for(int i=0;i<5;i++)
        {
        	//coulmns
            for(int j=0;j<a[i].length;j++)
            { 
                 
                a[i][j]=count++;
                b[i][j]=count++;
               
            }
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                c[i][j] = b[i][j]+a[i][j];
            }
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<c[i].length;j++)
            {
              System.out.print(c[i][j]+" ")  ;
                }
                System.out.println();
        }
    }
}
