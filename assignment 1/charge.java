import java.util.*;
class mobike
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int days=sc.nextInt();
int charge=0;
if(days<=5)
{
  charge=days*500;
System.out.println("charge are : "+charge);

}
else if(days>5 && days<=10)
{
  charge=2500+(400)*days-5;
System.out.println("charge are : "+charge);

}
else if (days>10)
{
  charge=4500+(200)*days-10;
System.out.println("charge are : "+charge);
}
}
}