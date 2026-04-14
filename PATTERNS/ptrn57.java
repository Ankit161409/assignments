import java.util.Scanner;
public class ptrn57
{
	public static void main(String[] args) {
		System.out.println("enter a number");
		int x= new Scanner( System.in).nextInt();
	 
		for(int i=1; i<=x; i++)
		{
			for(int j=5; j>=i; j--)
			if(j%2==0)
			{
				System.out.print("0");}
				else
				{System.out.print("1");}
			System.out.println();
		}		}
		
	}








