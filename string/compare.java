import java.util.Scanner;
 
 
class child
{
void compare(String s,String t)
{int i;
 char c[]=s.toCharArray();
 char d[]=t.toCharArray();
 
 boolean compare=true;

 
if( c.length !=d.length ){
System.out.print("strings length are not equal ! ");
 compare =false;
     
}	
else{

for(i=0; i<c.length; i++)
{
if(c[i]!=d[i] ){
System.out.print("strings   are not equal ! ");
		
		compare=false;
		break;
}
 

}
}
System.out.print(compare);

}

 


public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first string: ");
String s = sc.nextLine();
System.out.println("Enter the second string: ");
String t = sc.nextLine();
child ch=new child();
ch.compare(s,t);

}
}