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
rev=rev+s.charAt(i);
}

System.out.println("the reversed string is : "+rev);
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
