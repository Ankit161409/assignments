
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
}int sum=0;
System.out.println();
for (    i=0; i<m; i++)
{
for (   j=0; j<n; j++)
{
	sum=sum+x[i][j];
	
System.out.print(x[i][j]+" ");                //due to this code values can fill up horizantally  00 01 02  in  3x3 matrix
}
System.out.print("   "+sum); 
System.out.println();

}
System.out.println();
int sum1=0;
for (    i=0; i<m; i++)
{
for (   j=0; j<n; j++)
{
	sum1=sum1+x[j][i];
	
                                          //due to this code values can fill up horizantally  00 01 02  in  3x3 matrix
}
 
  System.out.print(sum1+" "); 
 
}

}}


