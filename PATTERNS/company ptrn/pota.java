class child
{
public static void main(String args[])
{
	int z=1;		

	for (int i=1; i<=8; i++)
	{
		for (int j=8; j>=i; j--)
		{
			System.out.print("*   ");
		}
			for(int k=1; k<=i; k++)
			{
				if(k>=2){
			  System.out.print( k*z+" ");
			  z+=2;
		}
		else
		{
			System.out.print(k+"   ");
			} 
			
			
			 
			 
			
	}System.out.println( );
}
}}