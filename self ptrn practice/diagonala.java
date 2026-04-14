import java.util.Scanner;
class child
{
public static void main(String args[])
{ 
System.out.println("enter the number");
Scanner s=new Scanner(System.in);

int x= s.nextInt();
	for (int i=1; i<=x; i++)
	{
		for (int j=1; j<=i; j++)
		{
			if(i>=2 && j<=i-1)
			{
		System.out.print (" ");}
		else
		{
		System.out.print ("*");	
		 
		}
		
		
		} System.out.println();
		}
		}
}
			