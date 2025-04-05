import java.util.Scanner;
 
 
class child
{
void triangle1(String s)
{
int i,j,k,l,n;

char c[]=s.toCharArray();
int m=c.length;
for(i=0; i<m ; i++)
{ 
 int z=0;
for(j=0; j<m-i; j++)
{
System.out.print(c[j]);
}


for(k=0; k<2*i-1; k++)
{
System.out.print(" ");
}
 
 
for(n=0; n<m-i; n++)
{
System.out.print(c[i+n]);
 z++;
}
z++;
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

