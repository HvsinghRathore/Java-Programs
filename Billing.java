import java.util.Scanner;

public class Billing {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the units you used: ");
            int unit = sc.nextInt();

            if (unit < 0) {
                System.out.println("Units cannot be negative.");
                return;
            }

            double bill;
            if (unit <= 500)
                bill = unit * 5;
            else if (unit <= 700)
                bill = 500 * 5 + (unit - 500) * 6;
            else if (unit <= 700)
                bill = 500 * 5 + 200 * 6 + (unit - 700) * 8;
            else
                bill = 500 * 5 + 200 * 6 + 300 * 8 + (unit - 500) * 10;

            System.out.println("Your bill is: $" + bill);
        }
    }
}