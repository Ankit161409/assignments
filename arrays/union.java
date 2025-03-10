import java.util.Scanner;
class child
{

public static void main(String[] args)
	{ 
	Scanner s = new Scanner(System.in);
	
		int z[]; 
	int x[];
	System.out.print( "enter the size of first array : ");
	int m =s.nextInt(); 
	System.out.print( "enter the size of first array : ");
	int n =s.nextInt();  
	 
	 z=new int[m];
	 x=new int[n];
	 	System.out.print( "enter the values for first array : ");
	  for (int i = 0; i <m; i++) {
			 z[i]=s.nextInt();  
		 }
		 System.out.print( "enter the values for second array : ");
		  for (int j = 0; j <n; j++) {
			 x[j]=s.nextInt();  
		 }
	 int i=0;
	 int j=0;
	 
	 System.out.print( "the union values of these arrays are : [ ");
	 while(i<m && j<n)
	 {
	 if(z[i]<x[j])
	 {
	 System.out.print(z[i]+" ");
	 i++;
	 }
	else if(x[j]<z[i])
	 {
	 System.out.print(x[j]+" ");
	 j++;
	 }
	 else 
	 {
	 System.out.print(x[j]+" ");
	 i++;
	 j++;
	 }}
	 
	 
	 while(i<m)
	 {
	 System.out.print(z[i]+" ");
	 i++;
	  }
	 while(j<n)
	 {
	 System.out.print(x[j]+" ");
	 j++;
	  }
	  System.out.print( "]");
}}
	 
	 
	 
 
 