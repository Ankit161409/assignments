import java.util.Scanner;
class child
{
void countchar(String s)
{
int count =0;

for(int i=0; i<s.length(); i++)             
{
char ch=s.charAt(i);
if(( ch=='a' ||   ch=='A' ||   ch=='e' ||ch=='i' ||   ch=='I' ||   ch=='O' ||ch=='o' ||   ch=='U' ||   ch=='e' ||    ch=='E' || ch=='u'  ))
{
count++;

}

}
System.out.println("the no of vowels are present in whole string is : "+count);

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
