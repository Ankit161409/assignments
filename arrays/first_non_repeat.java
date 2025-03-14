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
	 	  
		 for (int i = 0; i < z.length; i++) {
			   int count=0;
		  for (int j = 0; j < z.length; j++) {
		  
		  if(z[i]==z[j])
		  {
			  count++;
		  }
		  }
		 if(count==1)
		  {
			 System.out.print("first non repeating value is : "+z[i]);
		  break;
		 }
		  }
		 }
}