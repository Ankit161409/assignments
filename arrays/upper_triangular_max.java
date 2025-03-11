import java.util.Scanner;

class child
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	 int i,j;
	 System.out.println("enter the size of first matrix");
	
	 int x[][];
	 int m=s.nextInt();
  
	int n=s.nextInt();
x=new int[m][n];

System.out.println("enter the value for  "+m+"x"+n+ " matrix");
for (   i=0; i<m; i++)
{
for (   j=0; j<n; j++)
{
	
x[i][j]=s.nextInt();

}	
}

for (   i=0; i<m; i++)
{ for (   j=0; j<n; j++)
{
System.out.print(x[i][j]+" ");
}
System.out.println();
}


int max=x[0][0];
System.out.println();

for (    i=0; i<m; i++)
{
for (   j=0; j<n; j++)
{
	if( j>=i )
	{
	if(	
 x[i][j]>max)
 {
  max=x[i][j];
  
}

    }
}

  
}
	System.out.println("the larget number in upper triangle is : "+max);
}
}