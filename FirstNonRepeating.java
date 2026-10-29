public class FirstNonRepeating {
    public static void main(String[] args){
        String str = "swisswpp";
        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            boolean repeated = false;

            for (int j = i; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    repeated = true;
                    break;
                }
            }

            if (!repeated) {
                System.out.println("First non-repeating char: " + str.charAt(i));
                found = true;
                break;       
            }
        }

        if (!found) {
            System.out.println("No non-repeating character");
        }
    }
}
