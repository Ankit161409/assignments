
 
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
	int max=z[0];
	 
for ( int i=1; i<z.length; i++)
{
 
 if(z[i]>max)
  max=z[i];
  
}
    System.out.println("the larget number is : "+max);	
}
}