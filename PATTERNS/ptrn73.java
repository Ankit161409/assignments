public class ptrn73 {
    public static void main(String[] args) {
        
        int x = 5;
         int z = 1;   
 int a=1;
 
        for (int i =1; i <=x; i++) {
            
            for (int j=x-1; j>=i ; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <=i ; j++) 
			{
				 
			System.out.print (a) ;
			a++;}
			
			
			for (int j =i-1; j>=1 ; j--) 
			{
				 
				System.out.print (a--) ;
				 
 
			}	
			System.out.println();
			 z+=2;
			 
}}}
     