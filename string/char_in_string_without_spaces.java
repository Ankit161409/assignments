import java.util.Scanner;
class child
{
void countchar(String s)
{
int count =1;
char ch;
for(int i=0; i<s.length()-1; i++)
{
if((s.charAt(i)!=' '))
{
count++;
}
}
System.out.println("No of spaces in this string is : "+count);
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
