
import java.util.Scanner;

class child
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	 int i,j,k;
	 System.out.println("enter the size of first matrix");
	
	 
	 int m=s.nextInt();
  
	int n=s.nextInt();
	 System.out.println("enter the size of second matrix");
	 
	 
	int o=s.nextInt();
 
	int p=s.nextInt();                
int x[][];
int z[][];
int y[][];

x=new int[m][n];
z=new int[o][p];
y=new int[m][p];

System.out.println("enter the value for first "+m+"x"+n+ " matrix");
for (   i=0; i<m; i++)
{
for (   j=0; j<n; j++)
{
	
x[i][j]=s.nextInt();

}	 
}
System.out.println();
System.out.print("you gives the values in first matrix :\n\n");
for (    i=0; i<m; i++)
{
for (   j=0; j<n; j++)
{
System.out.print(x[i][j]+" " );
}
System.out.println();
}
System.out.println();
System.out.println("enter the value for 2nd "+o+"x"+p+ "  matrix");
for (   i=0; i<o; i++)
{
for (   j=0; j<p; j++)
{
	
z[i][j]=s.nextInt();

}	 
}
System.out.println();
System.out.print("you gives the values in second matrix :\n\n");


for (   i=0; i<o; i++)
{
for (   j=0; j<p; j++)
{
System.out.print(z[i][j]+" ");
}
System.out.println();
}
System.out.println();
System.out.print ("the multiply of these 2 matrices : ");
System.out.println("\n");

for (   i=0; i<m; i++)
{
for (   j=0; j<p; j++)
{
	y[i][j]=0;
	for (  k=0; k<o; k++)
	{
	y[i][j]+=x[i][k]*z[k][j];

}
System.out.print(y[i][j]+" ");

}
System.out.println();
}}}


