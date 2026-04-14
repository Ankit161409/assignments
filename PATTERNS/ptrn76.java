public class ptrn76 {
    public static void main(String[] args) {
        
        int x = 5;
         int z = 1;   
 char ch='A';
 
        for (int i =1; i <=x; i++) {
            
            for (int j=x-1; j>=i ; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <=i ; j++) 
			{
				 
			System.out.print (  (char)(ch+j-1)) ;}
			ch++;
			
			for (int j =i-1; j>=1 ; j--) 
			{
				 
				System.out.print (  (char)(ch+j-2)) ;
				 
				   
			}	
			System.out.println();
			 z+=2;
			 
}}}
     