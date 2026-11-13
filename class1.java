class Numbers{

    public boolean isZero(double x){
        if(x != 0)
            return false;
        return true;
    }
    public boolean isPositive(double x){
        if(x > 0)
            return true;
        return false;
    }
    public boolean isNegative(double x){
        if(x < 0)
            return true;
        return false;
    }
    public boolean isOdd(double x){
        if(x % 2 == 0)
            return false;
        return true;
    }
    public boolean isPrime(double x){
        if(x <= 1)
            return false;
        for(int i=2 ; i<x/2 ; i++){
            if(x % i == 0)
                return false;
        } 
        return true;
    }
    public boolean isArmstrong(int num){

        int original = num;
        int sum = 0;

        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;

            sum += Math.pow(digit, digits);

            num = num / 10;
        }

        if (sum == original) {
            return true;
        } else {
            return false;
        }
    }
    public int getFactorial(int num){
        int fac =1 ;
        if(num<=0)
            return 0;
        for(int i=2;i<=num;i++){
            fac=fac*i;
        }
        return fac;
    }
    public double getSqrt(int num){
        return Math.sqrt(num);
    }
    public double getSqr(int num){
        return Math.pow(num, 2);
    }
}

public class class1{
    public static void main(String[] args){
        Numbers obj = new Numbers();

        System.out.println("isZero(0): " + obj.isZero(0));
        System.out.println("isZero(5): " + obj.isZero(5));

        System.out.println("isPositive(10): " + obj.isPositive(10));
        System.out.println("isPositive(-5): " + obj.isPositive(-5));

        System.out.println("isNegative(-10): " + obj.isNegative(-10));
        System.out.println("isNegative(5): " + obj.isNegative(5));

        System.out.println("isOdd(7): " + obj.isOdd(7));
        System.out.println("isOdd(8): " + obj.isOdd(8));

        System.out.println("isPrime(7): " + obj.isPrime(7));
        System.out.println("isPrime(10): " + obj.isPrime(10));

        System.out.println("isArmstrong(153): " + obj.isArmstrong(153));
        System.out.println("isArmstrong(123): " + obj.isArmstrong(123));

        System.out.println("getFactorial(5): " + obj.getFactorial(5));

        System.out.println("getSqrt(25): " + obj.getSqrt(25));

        System.out.println("getSqr(5): " + obj.getSqr(5));

    }
}