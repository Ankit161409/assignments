                                                                             /*
EEEEE
DDDDD
CCCCC
BBBBB
AAAAA                                                                        */

  class  Main {
    public static void main(String[] args) {
        // Loop to print 5 rows
        for (char ch = 'E'; ch >= 'A'; ch--) {
            // Loop to print the character 'ch', five times in each row
            for (int j = 1; j <= 5; j++) {
                System.out.print(ch);
            }
            // Move to the next line after printing the row
            System.out.println();
        }
    }
}