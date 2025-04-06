import java.util.Scanner;
import java.util.*;
 
class child
{
void frequencywise(String s)
{
	String c[]=s.split(" ");
Map<String,Integer> map=new HashMap<>();
  s=s.toLowerCase();
 
int i,j;


for(i=0; i<c.length; i++ )      
{
	                   
if( !map.containsKey( c[i]))
{ 
map.put( c[i],1);
}
  else  
{  
 

 int cnt= map.get( c[i]);
   map.put( c[i],cnt+1);
}

}
System.out.print(map);
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string: ");
String s = sc.nextLine();
child ch=new child();
ch.frequencywise(s);

}
}