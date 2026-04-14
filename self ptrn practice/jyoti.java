class child
{
public static void main(String args[])
{ 

	for (int i=1; i<=5; i++)
	{
		for (int k=1; k<=5; k++)
		{
			if(i==1 ||k==3 ||i==5 && k==2 ||i==5 && k==1 ||i==4 && k==1  )
			{System.out.print("# ");
		} 
		 
else  
		{
			System.out.print("  ");
			 
	}		
	}
	System.out.print("  ");
	for (int j=1; j<=5; j++)
		{
			if( i==1 && j==1 ||i==2 && j==2 ||i==3 && j==3 ||i==1 && j==5 ||i==2 && j==4 ||i==4 && j==3||i==5 && j==3 )
			{System.out.print("# ");
		} 
		else
		{
			System.out.print("  ");
			 
	}
}System.out.print("  ");
for (int m=1; m<=5; m++)
		{
			if( i==1 || i==5   || m==1 || m==5 )
			{System.out.print("# ");
		} 
		else
		{
			System.out.print("  ");
			 
	}
}System.out.print("  ");
for (int n=1; n<=5; n++)
		{
			if(i==1 ||n==3  )
			{System.out.print("# ");
		} 
		else
		{
			System.out.print("  ");
			 
	}
}System.out.print("  ");
for (int o=1; o<=5; o++)
		{
			if(i==1 ||o==3 || i==5  )
			{System.out.print("# ");
		} 
		else
		{
			System.out.print("  ");
			 
	}
}
System.out.println( ); 
}			 
 

}}
