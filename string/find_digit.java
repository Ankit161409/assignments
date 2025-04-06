import java.util.Scanner;
class child
{
void find_digit(String s)
{
boolean digit=false;

for(int i=0; i<s.length(); i++)             
{
char ch=s.charAt(i);
if(( ch=='0' ||   ch=='1' ||   ch=='2' ||ch=='3' ||   ch=='4' ||   ch=='5' ||ch=='6' ||   ch=='7' ||   ch=='8' ||    ch=='9'   ))
{
    digit=true;
    break;
}
else
{
	digit=false;	
}

}
System.out.println("  digit in string : "+digit);

}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string : ");
String s=sc.nextLine();
child c=new child();
c.find_digit(s);
}
}
