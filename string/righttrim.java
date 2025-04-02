 import java.util.Scanner;

class child {
    void rightTrim(String s) {
        int i = s.length() - 1;

        // Skip trailing spaces from the end of the string
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Get the substring from the start to the last non-space character
        String trimmedString = s.substring(0, i+1 );
        System.out.println("Right-trimmed string: " + trimmedString);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        child c = new child();
        c.rightTrim(s);
        sc.close();
    }
}
