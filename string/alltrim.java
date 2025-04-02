import java.util.Scanner;
class child
{
void countchar(String s)
{
char ch;
for(int i=0; i<s.length(); i++)             
{
if((s.charAt(i)!=' '))
{
System.out.print(s.charAt(i));

}
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string : ");
String s=sc.nextLine();
child c=new child();
c.countchar(s);
}
}
