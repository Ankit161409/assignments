public class ptrn77 {
    public static void main(String[] args) {
        
        int x = 5;
         int a = 1;   
 char ch='a';
        for (int i = 1; i <= x; i++) {
            
            for (int j=x-1; j>=i ; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <=a; k++) 
			{
				if(i%2==0){
				System.out.print((char)( ch+k-1));}
				 else{System.out.print ("*");
			} 
			}	
			System.out.println();
			 a+=2;
			 
}}}
 
 
 
  