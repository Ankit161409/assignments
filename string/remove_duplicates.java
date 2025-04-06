import java.util.Scanner;
 
 
class child
{
void singleoccurence(String s )
{
	int i;
String result="";
 
  for (i=0; i<s.length(); i++ )	 
{
	String ch=""+s.charAt(i);
 if( result.contains(ch) )
{
continue;
}
//result=result+c;
result+=ch;

		}
		System.out.print("the single occurenced ch string is : "+result);
		} 

 

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the  string: ");
String s = sc.nextLine();
 
child ch=new child();
ch.singleoccurence(s);

}
}