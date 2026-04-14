import java.util.Scanner;
public class ptrn53
{
	public static void main(String[] args) {
		System.out.println("enter a number");
		int x= new Scanner( System.in).nextInt();
		char ch='F';
		for(int i=1; i<=x; i++)
		{
			for(int j=5; j>=i; j--)
			{	System.out.print((char)(ch-i));
			}System.out.println();
		}
		
	}
}








