import java.util.Scanner;
 
 
class child
{
void equals(String s)
{int i,j;
char c[]=s.toCharArray();
char temp ;
for (i=0; i<c.length; i++)
{
for (j=i+1; j<c.length; j++)
{ 
if(c[j]<c[i])
{
temp=c[j];
c[j]=c[i];
c[i]=temp;
}
}
System.out.print(c[i]);
}
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first string: ");
String s = sc.nextLine();
child ch=new child();
ch.equals(s);
}
}