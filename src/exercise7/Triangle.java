package exercise7;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int line = 1; line <= n; line++) {
            printLine(1, line);
        }

        // Print the bottom part of the triangle that is under the longest line
        for (int line = n - 1; line > 0; line--) {
          printLine(1, line);
        }
    }

    public static void printLine(int start, int end) {
        // Implement method
        for (; start <= end; start++) {
          System.out.print(start + " ");
        }
        System.out.println("");
    }
}
