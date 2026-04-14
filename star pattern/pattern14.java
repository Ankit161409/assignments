                                                           /*

       *
      * *
     *   *
    *     *
   *       *
  *         *
 *           *
                                                          */
														  
														  
														  
import java.util.Scanner;
 class child
{
public static void main(String args[])
{ 
 Scanner s=new Scanner(System.in);
System.out.println("enetr the number");
 int x= s.nextInt();
	for (int i=1; i<=x; i++)
	{
		for (int j=x; j>=i; j--)
		{
		System.out.print (" ");
		}
		  
		
		for (int k=1; k<i*2; k++)
		{
			if(k>1 && k<(i*2)-1)
			{
			System.out.print (" ");}
		else
		{
			System.out.print ("*");                 
		}                                   
		
		
		}System.out.println();
		}
		}
}
		
			