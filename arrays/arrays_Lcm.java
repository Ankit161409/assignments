  
  import java.util.Scanner;
  class child {
   public static void main(String args[]) {
   Scanner s = new Scanner(System.in);
		 System.out.println("Enter the size of array of aarays");
		 int m=s.nextInt();
		 int x[] = new int[m];
		 
		  System.out.println("Enter the values for arrays");
 
          
         for (int i = 0; i <m; i++) {
              
                 x[i]  = s.nextInt();   
             }
         
       
      int min, max, lcm = 0, y;
     
      for(int i = 0; i<m; i++) {
         for(int j = i+1; j<m-1; j++) {
            if(x[i] > x[j]) {
               min = x[j];
               max = x[i];
            } else {
               min = x[i];
               max = x[j];
            }
            for(int k =0; k<m; k++) {
               y = k * max;
               if(y%min == 0) {
                  lcm = y;
               
			   }
            }
         }
      }
      System.out.println("LCM of the given array of numbers : " + lcm);
   }
}