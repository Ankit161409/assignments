import java.util.Scanner;

public class staticblock {
    static int x;
    static {
        // Now it's guaranteed that the static block is executed before other classes access `x`
         
        x = new Scanner(System.in).nextInt();
    }

    public static void main(String[] args) {
        System.out.println("Main class main method");
    }
}

class main1 {
    public static void main(String[] args) {
        System.out.println("Enter value of x for class Main1");
        System.out.println(staticblock.x);
		 System.out.println(staticblock.x);
		  staticblock.x=40;
        System.out.println("Thanks for giving value in class Main1");
    }
}

class main2 {
    public static void main(String[] args) {
        System.out.println("Enter value of x for class Main2");
        System.out.println(staticblock.x);
        System.out.println("Thanks for giving value in class Main2");
    }
}
