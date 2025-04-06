import java.util.Scanner;
 
 
class child
{
void equals(String s,String t)
{int i;
 char c[]=s.toCharArray();
 char d[]=t.toCharArray();
 
 boolean equal=true;

 
if( c.length !=d.length ){
System.out.print("strings are not equal ! ");
 equal =false;
     }	
else
{
for(i=0; i<c.length; i++)
{
if(c[i]!=d[i] ){
System.out.print("strings are not equal ! ");
		
		equal=false;
		break;
		}
		}
}
System.out.print(equal);
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first string: ");
String s = sc.nextLine();
System.out.println("Enter the second string: ");
String t = sc.nextLine();
child ch=new child();
ch.equals(s,t);

}
}