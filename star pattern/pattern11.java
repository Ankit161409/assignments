                                                                    /*

    *
   *#*
  *###*
 *#####*
*#######*                                                          */




import java.util.Scanner;

class child {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x = s.nextInt();
        int z = 1;

        for (int i = 1; i <= x; i++) {
            // Print leading spaces
            for (int j = x; j > i; j--) {
                System.out.print(" ");
            }

            // Print pattern
            for (int k = 1; k <= z; k++) {
                if (k > 1 && k < z) {
                    System.out.print("#");
                } else {
                    System.out.print("*");
                }
            }

            // Move to the next line
            System.out.println();
            z += 2; // Increase the number of characters for the next row
        }

        s.close(); // Close the scanner
    }
}
