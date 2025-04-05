import java.util.Scanner;
 
 
class child
{
void triangle1(String s)
{
int i,j;
char c[]=s.toCharArray();
for(i=0; i<c.length; i++)
{
for(j=0; j<=i; j++)
{
 System.out.print(c[j]);

 }
  System.out.println();
 }
 }
 public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string: ");
String s = sc.nextLine();
child ch=new child();
ch.triangle1(s);

}
}