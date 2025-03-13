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
 System.out.println("enter the element to check the frequency : ");
	 int	 n= s.nextInt();
	 int freq=0;
	 int temp=z[0];
	  
for ( int i=0; i<x; i++)
	
{
if(z[i]==n)
	freq++;
}
System.out.println("the frequency of "+n+ " is "+freq);
	  
}
}