 import java.util.Scanner;
public class ptrn52
{
	public static void main(String[] args) {
	System.out.println("enter a number");
	int x= new Scanner( System.in).nextInt();
		 char ch='A';
		 
		for(int i=0; i<=x; i++)
		{
			for(int j=4; j>= i; j--)
			{	System.out.print((char)(ch+i));

			}System.out.println();
		}
		
	}
}








