 import java.util.Scanner;
 
 class child {
     public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
		 System.out.print(" enter the size of first aarrray is : ");
		
          int m=s.nextInt();
		   System.out.print(" enter the size of second aarrray is : ");
		 int n=s.nextInt();
         
		 int z[] = new int[m]; 
		 int x[] = new int[n];   
		 System.out.println(" enter the values for first aarrray  : ");
 for ( int i=0; i<m; i++)
{
	 z[i]=s.nextInt();
}
System.out.println(" enter the values for second aarrray  : ");
 for ( int i=0; i<n; i++)
{
	 x[i]=s.nextInt();
}
 
         
 
 
int y[]=new int[m+n];
 System.out.print("the first aarrray is : [");
 
for ( int i=0; i<m; i++)
{
	 System.out.print(z[i]+" ");
}
 
 System.out.print("]");
 System.out.println();
 
System.out.print("the second aarrray is : [");
for ( int i=0; i<n; i++)
{
	
 System.out.print (x[i]+" " );
	}
 System.out.print("]");
 System.out.println();
  System.out.print("the merged aarrray is : [");
for (int i=0; i<m; i++)                         // here the code starts for merge the arrays
{
	y[i]=z[i];
}
for (int i=0; i<n; i++)
{
	y[i+m]=x[i];
}
for ( int i=0; i<y.length; i++)
{
	 System.out.print(y[i]+" ");
}System.out.print("]");
}}


 