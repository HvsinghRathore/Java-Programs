// Program to find the prime numbers in given range

import java.util.Scanner;

public class prime {
    public static void main(String args[])
    {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Start of Range: ");
            int start = sc.nextInt();

            System.out.print("Enter End of Range: ");
            int end = sc.nextInt();

            if (start > end) {
                System.out.println("Start cannot be greater than End.");
                return;
            }

            int[] primes = new int[end - start + 1];   
            int count = 0;                             

            for (int i = start; i <= end; i++) {
                if (i < 2)
                    continue;

                boolean isPrime = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    primes[count] = i;  
                    count++;
                }
            }

            if (count == 0) {
                System.out.println("No prime numbers in this range.");
                return;
            }

            System.out.println("Prime numbers between " + start + " and " + end + ":");
            for (int k = 0; k < count; k++) {
                System.out.print(primes[k] + " ");
            }
            System.out.println();
            System.out.println("Total primes numbers found: " + count);

            sc.close();
    }
}
