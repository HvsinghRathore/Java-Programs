public class happy {
    public static void main(String[] args) {

        String str = "harshvardhansinghrathore";
        char check = 'a';
        int count = 0 ;

        for (int i = str.length()-1; i >= 0; i--) {
            if(str.charAt(i)==check){
                count++;
            }
        }

        if(count > 1)
            System.out.println("Given char is Happy character");
        else
            System.out.println("Given char is not Happy character");
    }
} 