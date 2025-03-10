
import java.util.Scanner;

class child
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	 int i,j;
	 System.out.println("enter the size of first matrix");
	 
	 int m=s.nextInt();
 
	int n=s.nextInt();
 
                  
int x[][];
int z[][];
int y[][];

x=new int[m][n];
z=new int[m][n];
y=new int[m][n];

System.out.println("enter the value for first 3x3 matrix");
for (   i=0; i<x.length; i++)
{
for (   j=0; j<x[i].length; j++)
{
	
x[i][j]=s.nextInt();

}	 
}

for (   i=0; i<m; i++)
{
for (   j=0; j<n; j++)
{
System.out.print(x[i][j]+" ");
}
System.out.println();
}
System.out.println("enter the value for 2nd 3x3 matrix");
for (   i=0; i<m; i++)
{
for (   j=0; j<n; j++)
{
	
z[i][j]=s.nextInt();

}	 
}
for (   i=0; i<m; i++)
{
for (   j=0; j<n; j++)
{
System.out.print(z[i][j]+" ");
}
System.out.println();
}
System.out.println("the addition of these 2 matrices : ");
System.out.println();
for (   i=0; i<z.length; i++)
{
for (   j=0; j<z[i].length; j++)
{
	y[i][j]=x[i][j]+z[j][i];
System.out.print(y[i][j]+" ");
}
System.out.println();
}}}


