                                                                            /*
EDCBA
EDCBA
EDCBA
EDCBA
EDCBA
                                                                           */
 


  class  Main {
    public static void main(String[] args) {
        // Loop to print 5 rows
        for (int i = 0; i < 5; i++) {
            // Loop to print characters from E to A
            for (char ch = 'E'; ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            // Move to the next line after printing the row
            System.out.println();
        }
    }
}