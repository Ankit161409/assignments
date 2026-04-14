public class ptrn70 {
    public static void main(String[] args) {
        
        int x = 5;
         int a = 1;   
 int z=1;
        for (int i = 1; i <= x; i++) {
            
            for (int j=x-1; j>=i ; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <=a; k++) 
			{
				 
				System.out.print(z );
				 
				  z++;
			}	
			System.out.println();
			 a+=2;
			 
}}}
 