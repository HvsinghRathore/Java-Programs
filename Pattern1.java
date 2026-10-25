// Hollow Diamond pattern

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num < 1) {
                System.out.println("Number must be at least 1.");
                return;
            }

            for (int r = 1; r <= 2 * num - 1; r++) {
                int row = (r <= num) ? r : 2 * num - r;   // 1,2,...,num,...,2,1

                // leading blank cells
                for (int j = 0; j < num - row; j++)
                    System.out.print("   ");

                // left number, padded to a 3-wide cell
                System.out.printf("%-3d", row);

                if (row > 1) {
                    // blank cells between the two numbers
                    for (int k = 0; k < 2 * row - 3; k++)
                        System.out.print("   ");
                    System.out.print(row);
                }
                System.out.println();
            }
        }
    }
}