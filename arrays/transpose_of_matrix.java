
import java.util.Scanner;

class child
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	 int i,j,k;
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
System.out.println();
for (    i=0; i<m; i++)
{
for (   j=0; j<n; j++)
{
System.out.print(x[i][j]+" ");                //due to this code values can fill up horizantally  00 01 02  in  nxn matrix  
}
System.out.println();
}
  
System.out.println("the transpose of this : ");
System.out.println();
int temp=0;
for (   i=0; i<m; i++)
{
for (   j=0; j<n; j++)
{
System.out.print(x[j][i]+" ");                //due to this code values can fill up vertically  00 10 20  in nxn matrix which gives the transpose of matrix given by user
}
System.out.println(); 
}

}}


