import java.util.Scanner;
 
 
class child
{
void singleoccurence(String s,String t )
{
	int i;
 
 
   
 if( s.contains(t) )
{
 System.out.print("string 1 contains the string 2  " );
}
else
{
	System.out.print("string 1 doesn't contains the string 2  " );
}
		}
		 
		

 

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the  string: ");
String s = sc.nextLine();
 System.out.println("Enter the  string: ");
String t = sc.nextLine();
 
child ch=new child();
ch.singleoccurence(s,t);

}
}