public class ptrn37 {
    public static void main(String[] args) {
        // Define the height of the pyramid
        int x = 5;
        int a = 1;
        // Loop through each row
        for (int i = 1; i <= x; i++) {
            // Print leading spaces for each row
            for (int j=x-1; j>=i ; j--) {
                System.out.print(" ");
            }

            // Print the characters for each row
            for (int k = 1; k <= a; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
				a+=2;
				
}}}