import java.util.Scanner;
import java.util.*;
 
class child
{
void frequencywise(String s)
{
Map<Character,Integer> map=new HashMap<>();
  s=s.toLowerCase();
 
int i,j;
 

for(i=0; i<s.length(); i++ )      
{
	char c=s.charAt(i);                    // for each loop method
if( !map.containsKey( c))
{ 
map.put( c,1);
}
  else  
{  int cnt=map.get( c);
   map.put( c,cnt+1);
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