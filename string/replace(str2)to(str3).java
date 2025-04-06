import java.util.Scanner;
 
 
class child
{
void replace(String s,String t,String d ,String n )
{
	int i;
 
 String z="";
   
 if( s.contains(t) )
{
 z=t.replace(d,n);
	System.out.println("\n");
 
 System.out.println("  string 1 contains the string 2  " );
	System.out.println("\n");
	// System.out.println();	
	System.out.println("                    the replaced string is : "+z);
 	System.out.println("the string 1 is : "+s);
	System.out.println("                    the string 1 is : "+t);
	System.out.println("the string(3) you want to replace: : "+d);
System.out.println("                        the string which can be replaced to: "+n);
	
}
else
{
	System.out.println("string 1 doesn't contains the string 2  " );
}
 
		} 
		

 

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the  string(s1): ");
String s = sc.nextLine();
 System.out.println("Enter the  string(s2): ");
String t = sc.nextLine();
 System.out.println("Enter the  string(s3) you want to replace: ");
String d = sc.nextLine();
System.out.println("Enter the  string which can be replaced to: ");
String n = sc.nextLine();
 
child ch=new child();
ch.replace(s,t,d,n);

}
}