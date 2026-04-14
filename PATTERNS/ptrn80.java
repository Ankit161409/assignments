public class ptrn80 {
    public static void main(String[] args) {
        
        int x = 5;
         int z = 7;   
 
 
        for (int i = 1; i <= x; i++) {
            
            for (int j=1; j<=i; j++) {
                System.out.print(" ");
            }

            for (int k =1 ; k <=z; k++) 
			{
				 
				System.out.print ("*") ;
				 
				   
			}	
			System.out.println();
			 z-=2;
			 
}}}
   