                                 /*

 
*
**
***
****
*****
****
***
**
*                                            */

import java.util.Scanner;
public class Main
{
    
	public static void main(String[] args) {
	    System.out.println("enter the number");
	    Scanner s=new Scanner(System.in);
	    int x= s.nextInt();
	   // int i;
	   for(int i=0; i<x; i++)
	    {
	       for(int j=0; j<=i; j++) 
	    {
	    
		System.out.print("*");
	}
	System.out.println();
	    }
	 for( int i=1; i<x; i++)
	    {
	       for(int  j=x; j>i; j--) 
	    {
	    
		System.out.print("*");
	    }
	System.out.println();
}}}
