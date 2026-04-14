public class ptrn58 {
    public static void main(String[] args) {
         // Number of rows
        for (int i = 0; i <5; i++) {
            for (int j =5; j>=i; j--) {
                System.out.print((i + j) % 2);
            }
            System.out.println();
        }
    }
}