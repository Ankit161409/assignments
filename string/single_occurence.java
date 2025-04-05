import java.util.Scanner;
 
 
class child
{
void single(String s)
{
 System.out.print("oppposite cased value is : ");
  char c[]=s.toCharArray();
int i,j;
for(i=0; i<c.length+1; i++)             
{
if(c[i]==c[i+1]  )
{ 
System.out.print(c[i]);
}
else if

(c[i]==c[i+1]  )
{ 
System.out.print(c[i+1]);
}
}
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string: ");
String s = sc.nextLine();
child ch=new child();
ch.single(s);

}
}