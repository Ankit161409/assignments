import java.util.Scanner;
class child
{
void length(String s)
{
int count=0;
for(int i=0; i<s.length(); i++)             
{
if((s.charAt(i)!=' ') || (s.charAt(i)==' ') )
{
count++;
}
}
System.out.println("the length of string is : "+count);

}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string : ");
String s=sc.nextLine();
child c=new child();
c.length(s);
}
}
