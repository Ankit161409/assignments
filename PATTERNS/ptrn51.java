 import java.util.Scanner;
public class ptrn51
{
	public static void main(String[] args) {
		System.out.println("enter a number");
		int x= new Scanner( System.in).nextInt();
	 char ch;
 
		for(int i=0; i<x; i++)
		{
			ch=(char)('E'-i);
			for(int j=5; j>i; j--)
			   
			{
				System.out.print(ch--);}
				 {
			System.out.println();
		}		}
		 
		
	}
}


