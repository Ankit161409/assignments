public class pattern67  {
    public static void main(String[] args) {
        
        int x = 5;
         int a = 1;   
 char ch='A';
        for (int i = 0; i < x; i++) {
            
            for (int j=4; j>=i ; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <=a; k++) 
			{
				System.out.print((char)(ch+i));
			}
			System.out.println();
				 a+=2;
}}}
 
 
 
  