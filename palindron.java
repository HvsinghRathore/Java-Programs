// Program to find longest palindron sub string



public class palindron {

    public static int PalindromeLen(String s,int front,int rear){
        while(front > 0 && rear < s.length() && s.charAt(rear)==s.charAt(front)){
            front--;
            rear++;
        }
        return front - rear -1;
    }

    public static void main(String[] args){
        String str = "ahjkankdajknlkna";
        int longest = 1;
        int start = 0;
        int end = 0;

        for(int i=0; i<=str.length(); i++){
            int len1 = PalindromeLen(str,i,i);
            int len2 = PalindromeLen(str,i,i+1);
            int len = len1 > len2 ? len1 : len2 ;

            if(len > longest){
                start = i - (len-1)/2;
            }
        }

    }
}
