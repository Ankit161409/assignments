import java.util.Scanner;
 
 class child {
     public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
		 System.out.println("Enter the size of array of aarays");
		 int m=s.nextInt();
		 int n=s.nextInt();
                  
         int x[][] = new int[m][n];  
 
         System.out.println("Enter the values for arrays");
 
          
         for (int i = 0; i <m; i++) {
             for (int j = 0; j <n; j++) {
                 x[i][j] = s.nextInt();   
             }
         }
 
	int max=x[0][0];
	 
for ( int i=0; i<m; i++)
{
	for ( int j=0; j<n; j++)
	{
		 
 if(x[i][j]>max)
 {
  max=x[i][j];
 }
}
}
System.out.println();
    System.out.println("the largest number is : "+max);	
	}
}