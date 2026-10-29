import java.util.*;

public class Array {
    public static void main(String[] args)
    {
        int[] numbers = new int[7];
        int[] check = new int[7];
        int count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 7 numbers for Array:");
        for(int i=0; i<=6; i++){
            numbers[i] = sc.nextInt();
        }

         for(int i=0; i<=6; i++){

            int value = numbers[i];
            boolean found = false;

            for (int j = 0; j < count; j++) {
                if (check[j] == value) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                check[count] = value;
                count++;
            }
        }

        System.out.println("new Array is");
        for (int i = 0; i < count; i++) {
            System.out.print(check[i] + " ");
        }
        System.out.println();
        System.out.println("number of new members in array is:" + count);

        sc.close();
    }

}