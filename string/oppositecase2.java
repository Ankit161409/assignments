import java.util.Scanner;
 
 
class child
{
void oppositecase(String s)
{
 System.out.print("oppposite cased value is : ");
  
int i,j;
for(i=0; i<c.length; i++)             
{
if(c[i]>='a' && c[i]<='z'  )
{ 
c[i]=(char)(c[i]-32);
}
else if

(c[i]>='A' && c[i]<='Z'  )
{ 
c[i]=(char)(c[i]+32);
}
  

System.out.print(c[i]);
}
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string: ");
String s = sc.nextLine();
child ch=new child();
ch.oppositecase(s);

}
}