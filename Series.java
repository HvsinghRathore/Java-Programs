// Sum of series [x - x^3 + x^5 + ....]

import java.util.*;

public class Series
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = sc.nextDouble();

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        if (n < 0) {
                System.out.println("Input cannot be negative.");
                return;
            }

        double sum = 0;

        for(int i = 0; i < n; i++){
            double term = Math.pow(x, 2 * i + 1);
            if (i == 1)
                    sum -= term;    
            else
                    sum += term;
        }

        System.out.println("Sum of given serice is:" + sum);
        sc.close();
    }
}
