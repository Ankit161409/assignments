import java.util.Scanner;
class child
{
void reversestring(String s)
{
int count =1;
int len=s.length();
String rev="";
for(int i=len-1; i>=0; i--)
{
rev=rev+s.charAt(i);                     // this is logic
}
if(rev.equals(s))
{
System.out.println("this string is palindrome : "+ rev);
}
else
{
System.out.println("this string is not palindrome");	
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print ("enter the string : ");
String s=sc.nextLine();
child c=new child();
c.reversestring(s);
}
}
