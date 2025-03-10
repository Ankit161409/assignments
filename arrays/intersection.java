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
	 
	 System.out.print( "the intersection values of these arrays are : [ ");
	  for (  i = 0; i <m; i++)
	  {
		  for (  j = 0; j<n; j++)
		  {  
	 if(x[j]==z[i])
	 {
	 System.out.print(x[j]+" "); 
	 }
		  }
	  }
	 
	  System.out.print( "]");
}}
	 
	 
	 
 
 