import java.util.Scanner;

class Patt2 {
    public static void main(String... s) {
        int i, j, sp, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size:");
        n = sc.nextInt();
        sp = 0;

        if (n >= 2) {
            for (i = 0; i < n * 3; i++) {
                if (i < n) {
                    System.out.print("@");
                } else if (i < n * 2) {
                    if (i == n) {
                        System.out.print("@");
                    } else {
                        for (j = 0; j < sp; j++) {
                            System.out.print(" ");
                        }
                    }

                    for (j = 0; j < n; j++) {
                        System.out.print("*");
                    }

                    sp += n - 1;

                    if ((i + 1) == (2 * n)) {
                        sp++;
                        System.out.print("@");
                    }
                } else {
                    for (j = 0; j < sp; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("@");
                }

                System.out.print("\n");
            }
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
