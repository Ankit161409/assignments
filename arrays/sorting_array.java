 import java.util.Scanner;
class child
{

public static void main(String[] args){
 Scanner s = new Scanner(System.in);
	
		int z[];
		System.out.println("enter the size for arrays");	
	int	 x= s.nextInt();  
		z=new int[x];
		System.out.println("enetr the values for arrays");	
		 for (int i = 0; i < z.length; i++) {
			 z[i]=s.nextInt();  
		 }
		 System.out.print("the given aaray is : [");	
		 for (int i = 0; i < z.length; i++) {
			  System.out.print(z[i]+" ");	
		 }
			 
 System.out.print("]");
 System.out.println( );
 int temp=0;
 for ( int i=0; i<z.length; i++)
{
 for ( int j=i+1; j<z.length; j++)
 {
 if(z[i]>z[j])
 {
 temp=z[i];
 z[i]=z[j];
 z[j]=temp;
 
  
}}}
System.out.print("the sorted aarrray is : [");
for ( int i=0; i<z.length; i++)
{
 System.out.print(z[i]+" ");
 }
    System.out.print( "]");
}
}