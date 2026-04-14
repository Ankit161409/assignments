                              /*       
    *
   **
  ***
 ****
*****
                               */

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    System.out.println("enter the number");
	    Scanner s= new Scanner(System.in);
	    int x= s.nextInt();
	    for( int i=0; i<=x; i++  )
	    {
	    for(int j=x; j>i; j--)
	    {
	        System.out.print(" ");
	    }
	    for(int k=0; k<i; k++)
	    {
	    System.out.print("*");
	    }
	    System.out.println( );
		 
	}
}}
