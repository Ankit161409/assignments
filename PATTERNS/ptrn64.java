import java.util.Scanner;
public class ptrn64

{
	public static void main(String[] args) {
		System.out.println("enter a number");
		int x= new Scanner( System.in).nextInt();
	 char ch='A';
		for(int i=1; i<=x; i++)
		{
			for(int j=0; j<i; j++)
			 
			{
				System.out.print((char)(ch+j));
			}
			System.out.println();
				}
		
	}
}