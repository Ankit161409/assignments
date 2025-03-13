
 import java.util.Scanner;
class child
{

public static void main(String[] args){
 Scanner s = new Scanner(System.in);
	
		int z[];
		System.out.println("enetr the size for arrays");	
			
	int	 x= s.nextInt();  
		z=new int[x];
		System.out.println("enetr the values for arrays");	
		 for (int i = 0; i < z.length; i++) {
			 z[i]=s.nextInt();  
		 }
 System.out.println("enter the times to shift the elements");
	 int	 n= s.nextInt();
for ( int i=0; i<n; i++)
	
{
	int last=z[x-1];
	for ( int j=x-1; j>0; j--)
	{
		 z[j]=z[j-1];
	}
	z[0]=last;
}
    System.out.print("the right shifted values are : \n");
 for ( int i=0; i<x; i++)
	
{
   
   System.out.print (z[i]+" ");	
}
   

}
}