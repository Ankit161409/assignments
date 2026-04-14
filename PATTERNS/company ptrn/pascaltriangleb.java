 
 class child
{
public static void main(String args[])
{ 

	for (int i=0; i<7; i++)
	{
		for (int j=7; j>i; j--)
		{
		System.out.print (" ");
		}
		int z=1;
		
		for (int k=0; k<=i; k++)
		{
		System.out.print (z+"  ");
		
		z=z*(i-k)/(k+1);                   // instead of this formula we can use another formula 
		}                                  // z=z*row 
		System.out.println();
		
		}
		}
		}
		
		
			