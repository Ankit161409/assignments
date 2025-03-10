 import java.util.Scanner;
 
 class child {
     public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
		 System.out.println("Enter the size of array of aarays");
		 int m=s.nextInt();
		 int n=s.nextInt();
                  
         int x[][] = new int[m][n];   
         System.out.println("Enter the values for arrays");
 
       
         for (int i = 0; i <m; i++) {
             for (int j = 0; j <n; j++) {
                 x[i][j] = s.nextInt();   
             }
         }
	  
	 
for ( int i=0; i<m; i++)
{
		 System.out.print("the original aarrray is : ");
		 System.out.print ("[");
	for ( int j=0; j<n; j++)
{
	System.out.print (x[i][j]+" ");
 
}
System.out.print ("]");
System.out.println();
}

 
 System.out.println( );
 int temp=0;
 for ( int i=0; i<m; i++)
{
 for ( int j=0; j<n; j++)
 {
	 for ( int k=0; k<m; k++)
{
 for ( int l=0 ; l<n; l++)
 {
 if(x[i][j]<x[k][l])
 {
 temp=x[i][j];
 x[i][j]=x[k][l];
 x[k][l]=temp;
 
  
}}}}}
System.out.print("the sorted aarrray is : [");
for ( int i=0; i<m; i++)
{
	for ( int j=0; j<n; j++)
{
 System.out.print(x[i][j]+" ");
 }
}
    System.out.print( "]"); 
}
}