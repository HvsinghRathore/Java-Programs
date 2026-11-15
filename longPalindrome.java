import java.util.Scanner;

public class longPalindrome {

    static int palanLenth(String str,int i){

        int len = 1;

        for (int j = 1; i-j >= 0 && i+j < str.length(); j++) {

            if(str.charAt(i+j)!=str.charAt(i-j)){
                return len;
            }

            len +=2;
        }
        return len;
    }

    static int palanLenth(String str,int i,int j){
        
        int len = 0;

        for (int k = 0; i-k >= 0 && j+k < str.length(); k++) {

            if(str.charAt(i-k)!=str.charAt(j+k)){
                return len;
            }

            len += 2;
        }
        return len;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int len1;
        int len2;
        int start = 0;
        int maxLen = 0;

        for (int i = 0; i < str.length(); i++) {
            len1 = palanLenth(str, i);
            len2 = palanLenth(str, i, i+1);

            if (len1 > maxLen) {
                maxLen = len1;
                start = i - len1/2;
            }

            if (len2 > maxLen) {
                maxLen = len2;
                start = i - len2/2 + 1;
            }
        }

        String result = str.substring( start , start + maxLen);
        System.out.println("Longest substring: " + result);
        System.out.println("Length: " + maxLen);

        sc.close();
    }
}
