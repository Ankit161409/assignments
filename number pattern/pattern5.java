                                                                                /* 
10101
01010
10101
01010
10101
                                                                                */

import java.util.Scanner;
  class Main
{
	public static void main(String[] args) {
	    System.out.println("enter the number");
	 Scanner sc=new Scanner(System.in);
	 int x = sc.nextInt();
	 for(int i=1; i<=x; i++)
{	 
	if(i%2==0){
	    System.out.println("01010");}
	else 
	System.out.println("10101");
}
}}
 
  