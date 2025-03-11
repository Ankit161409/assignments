
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
System.out.println ("the user gives the matrix is : ");
for (   i=0; i<m; i++)
{
for (   j=0; j<n; j++)
{
	
System.out.print ( x[i][j]+" ");
 

}	
System.out.println();

} 
System.out.println();
System.out.print(" the sum of whole elements of this matrix is :  ");
for (    i=0; i<m; i++)
{
for (   j=0; j<n; j++)
{
	sum=sum+x[i][j];                   // this forumla gives the sum of each row of matrix
	
               
}

 

}
System.out.print(+sum); 
 
 
}

}


