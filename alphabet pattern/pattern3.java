                                                                            /*
*****
ABCDE
*****
ABCDE
*****                                                                        */

 class child {
    public static void main(String[] args) {
        // Loop to print 5 rows
        for (int i = 0; i < 5; i++) {
            // For even rows (0, 2, 4), print asterisks
            if (i % 2 == 0) {
                System.out.println("*****");
            } else {
                // For odd rows (1, 3), print the characters ABCDE
                System.out.println("ABCDE");
            }
        }
    }
}