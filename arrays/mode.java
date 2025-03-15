 import java.util.Scanner;
class child
{

public static void main(String[] args){
 Scanner s = new Scanner(System.in);
	
		int z[];
		System.out.println("enetr the size for arrays");	
			
	int	 x= s.nextInt();  
		z=new int[x];
		System.out.println("enetr the values for arrays");	
		 for (int i = 0; i < z.length; i++) {
			 z[i]=s.nextInt();  
		 }
  
	int maxfreq=0;
	 int maxelement=z[0];
	  
for ( int i=0; i<x; i++){
 int freq=0;
for ( int j=0; j<x; j++)
{
 if(z[i]==z[j]){
freq++;}}

if(freq>maxfreq){
maxfreq=freq;
 maxelement=z[i];
}
}
 System.out.println("the mode is "+maxelement+ " with frequency: "+maxfreq);

 
 
}
	  
}
