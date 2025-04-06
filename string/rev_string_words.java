import java.util.Scanner;
class child
{
void reversestring(String s)
{
String ch[]=s.split(" ");
 
 
String rev="";
System.out.print ("the reversed string is : ");
for(int i=ch.length-1; i>=0; i--)
{
rev=rev+ch[i];
if(i!=0)
	rev=rev+" ";
}
System.out.print (rev); 
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
