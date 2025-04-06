import java.util.Scanner;
class child
{
void digits(String s)
{
int count =0;

for(int i=0; i<s.length(); i++)             
{
char ch=s.charAt(i);
if(( ch=='0' ||   ch=='1' ||   ch=='2' ||ch=='3' ||   ch=='4' ||   ch=='5' ||ch=='6' ||   ch=='7' ||   ch=='8' ||    ch=='9'   ))
{
count++;

}

}
System.out.println("the no of digits are present in whole string is : "+count);

}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string : ");
String s=sc.nextLine();
child c=new child();
c.digits(s);
}
}
