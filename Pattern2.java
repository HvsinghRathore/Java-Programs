import java.util.*;

public class Pattern2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int rows = sc.nextInt();

        if (rows <= 0) {
                System.out.println("Please enter a positive number.");
                return;
            }

        int digit1 = 0;
        int digit2 = 1;

        for(int i=0; i<rows; i++){
            for(int j=0; j<=i; j++){
                System.out.print(digit2+" ");
                int temp = digit1;
                digit1 = digit2;
                digit2 = temp + digit2;
            }
            System.out.println();
        }
        sc.close();
    }
}