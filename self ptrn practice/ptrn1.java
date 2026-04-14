class child {
    public static void main(String[] args) {
        int n = 7; // number of rows

        // Outer loop to handle the number of rows
        for (int i = 1; i <= n; i++) {
            // Print spaces for alignment
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print the increasing part of the numbers
            for (int j = i; j  < 2 * i; j++) {
				if(j%2==0)
				{
                System.out.print(j*2);
            }
else
{System.out.print(" ");
}
			}            // Move to the next line after each row
            System.out.println();
        }
    }
}
