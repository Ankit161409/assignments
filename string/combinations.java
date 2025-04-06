import java.util.Scanner;
 
 
class child
{
void equals(String s)
{int i,j,k;
char c[]=s.toCharArray();
char temp ;
for (i=0; i<c.length; i++)
{
for (j=0; j<c.length; j++)
{ 
for (k=0; k<c.length; k++)
{ 
if(i!=j &&j!=k &&i!=k)
System.out.println(""+c[i]+c[j]+c[k]);
}}}
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