import java.util.ArrayList;

public class method {

    static boolean isPrime(int num){
        if(num <= 1)
            return false;
        for(int i=2;i<num/2;i++){
            if(num%i==0)
                return false;
        } 
        return true;
    }

    static ArrayList<String> twinPrime(int num){

        ArrayList<String> list = new ArrayList<>();
        for(int i=2;i<=num;i++){
            if(isPrime(i)&&isPrime(i+2)){
                list.add("("+i+","+(i+2)+")");
            }
        }
        return list;
    }

    static boolean triangular(int num){

        int i=1;
        while(num>0){
            num=num-i;
            if(num==0)
                return true;
            i++;
        }
        return false;
    }

    static String middelChar(String arr){
        int len = arr.length();
        if(len%2==0){
            return  "("+arr.charAt(len/2)+","+arr.charAt((len/2)+1)+")";
        }else
            return "("+arr.charAt((len+1)/2)+")";
    }

    static boolean validPass(String arr){
          if (arr.length() < 10) {   
            return false;
        }

        int digit =0;

        for(int i=0;i<arr.length();i++){
            char check = arr.charAt(i);

            if(Character.isUpperCase(check))
                continue;
            else if(Character.isLowerCase(check))
                continue;
            else if(Character.isDigit(check))
                digit++;
            else
                return false;
        }

        if(digit>=2)
            return true;
        return false;

    }
    public static void main(String[] args){

        boolean bl = validPass("ahrhsHH1213");
        System.out.println(bl);
    }
}
