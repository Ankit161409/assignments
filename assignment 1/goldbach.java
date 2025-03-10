 import java.util.Scanner;
 class child{
 public  static boolean isprime(int z)
{
          int count=0;
	    for(int i=1; i<=z; i++){                     //prime number function to check the number is prime
	      if(z%i==0) 
		  count++;		
		}
  return count==2; 
}


public static void main(String[] args)
	{
		while(true){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n= s.nextInt();
	int b=0;
	 for(int a=3; a<=n/2; a+=2)   
	 {		                                               // loop for goldbach number
	 b=n-a;
	 if(isprime(a) && isprime(b))
	 {
	 System.out.println("the odd prime pairs of "+n+" is : "+a+" , "+b);
	 }
 }}}}