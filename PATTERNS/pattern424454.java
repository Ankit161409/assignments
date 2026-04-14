import java.util.Scanner;
public class pattern424454
{
	public static void main(String[] args) {
		System.out.println("enter a number");
		int x= new Scanner( System.in).nextInt();
	   int z=6;
		for(int i=1; i<=x; i++)
		{
			for(int j=5; j>=i; j--)
			{	System.out.print(z-j);
			 
			}System.out.println();
		}
		
	}
}
