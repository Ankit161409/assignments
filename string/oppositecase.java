import java.util.Scanner;
 
 
class child
{
void oppositecase(String s)
{
 System.out.print("oppposite cased value is : ");
  
int i,j;
for( char c : s.toCharArray)             
{
if(c>='a' && c[i]<='z'  )
{ 
c=(char)(c-32);
}
else if

(c>='A' && c<='Z'  )
{ 
c=(char)(c+32);
}
  

System.out.print(c);
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