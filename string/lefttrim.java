 import java.util.Scanner;

class child {
    void leftTrim(String s) {
        int i = 0;
        // Skip leading spaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // Get the substring starting from the first non-space character
        String trimmedString = s.substring(i);
        System.out.println("Left-trimmed string: " + trimmedString);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        child c = new child();
        c.leftTrim(s);
        sc.close();
    }
}
