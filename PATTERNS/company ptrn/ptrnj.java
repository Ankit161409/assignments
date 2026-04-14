class child
{
public static void main(String args[])
{ int z=8;
 
 int y=0;
	for (int i=1; i<=8; i++)
	{
		for (int k=1; k<=i; k++)
		{
			System.out.print("  ");
		}
			for(int j=1; j<=z; j++)
			
			{ 
			System.out.print(j+" ");
			} 
			z--;
			for (int l=7; l>=i; l--)
			{
				
				System.out.print(l-y+" ");
			}	
			y++;
				 
			System.out.println( );
	} 
}
}
			