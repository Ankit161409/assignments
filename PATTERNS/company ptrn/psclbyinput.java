
import java.util.Scanner;
 class child
{
public static void main(String args[])
{ 
 Scanner s=new Scanner(System.in);
System.out.println("enetr the number");
 int x= s.nextInt();
	for (int i=0; i<x; i++)
	{
		for (int j=x; j>i; j--)
		{
		System.out.print (" ");
		}
		int z=1;
		
		for (int k=0; k<=i; k++)
		{
		System.out.print (z+"  ");
		
		z=z*(i-k)/(k+1);                    
		}                                   
		System.out.println();
		
		}
		}
		}
		
		
			