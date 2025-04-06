import java.util.Scanner;
 
 
class child
{
void equals(String s)
{
int i,j;
String c[]=s.split(" ");
String max=c[0];
for (i=0; i<c.length; i++)
{
  
if(c[i].length()>max.length())
{
max=c[i];

}
}
System.out.print("your largest palindrome or word is : "+max);
}

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your palindromes string: ");
String s = sc.nextLine();
child ch=new child();
ch.equals(s);
}
}