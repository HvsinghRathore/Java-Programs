
import java.util.Scanner;

public class subString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int maxLength = 0;
        int start = 0;
        int maxStart = 0;

        for (int i = 0; i < str.length(); i++) {

            for (int j = start; j < i; j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    start = j + 1;
                    break;
                }
            }

            if (i - start + 1 > maxLength) {
                maxLength = i - start + 1;
                maxStart = start;
            }
        }

        String result = str.substring(maxStart, maxStart + maxLength);

        System.out.println("Longest substring: " + result);
        System.out.println("Length: " + maxLength);

        sc.close();
    }
}
