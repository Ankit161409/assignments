import java.util.Scanner;
public class ptrn62
{
	public static void main(String[] args) {
		System.out.println("enter a number");
		int x= new Scanner( System.in).nextInt();
	   int z=0;
		for(int i=1; i<=x; i++)
		{
			for(int j=1; j<=i; j++)
		 
			{
				System.out.print(z+j );
			}
			System.out.println();
			z++;
		}		}
		
	}

          