import java.util.Scanner;
class child
{
void countwords(String s)
{
int count =1;
for(int i=0; i<s.length()-1; i++)
{
if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
{
count++;
}
System.out.println("No of words in this string is : "+count);

}
 
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string : ");
String s=sc.nextLine();
child c=new child();
c.countwords(s);
}
}