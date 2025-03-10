import java.util.Scanner;
class child
{
	public static void main(String[] args)
	{
	int r;
	int sum=0;
 
	Scanner s=new Scanner(System.in);
	while(true){
	System.out.println ("enter the number ");
	 int n=s.nextInt();
	
	while(n>9){
		while(n>0){
	r=n%10;
	sum=sum+(r*r);
	n=n/10;
		}
		n=sum;
		sum=0;
	}
	if(n==1){
	System.out.println("num is happy");
	}
	else{
	System.out.println ("num is not happy");
	}
	}
}}

