 import java.util.Scanner;
class child
{

public static void main(String[] args){
 Scanner s = new Scanner(System.in);
	
	 
	    	 System.out.println("enter the binary code which you want to convert into decimal : "); 
		
		int n=s.nextInt();
	 
		 int x=n;
		 int d=0;
		 int r=0;
		 int t=0;
	 	  while(n>0)
		  {
			  r=n%10;
			  n=n/10;
			  d=d+r*(int)Math.pow(2,t);
			    t++;  
		  }
		
			System.out.println("the decimal value of this binary code is : "+d);  
		  }
		  }
		 