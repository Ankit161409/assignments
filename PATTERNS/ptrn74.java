public class ptrn74 {
    public static void main(String[] args) {
        
        int x = 5;
         int z = 1;   
 
 
        for (int i = 1; i <= x; i++) {
            
            for (int j=x-1; j>=i ; j--) {
                System.out.print(" ");
            }

            for (int k =  1; k <=z ; k++) 
			{
				 
				System.out.print ( Math.abs(i-k)) ;
				 
				   
			}	
			System.out.println();
			 z+=2;
			 
}}}
     