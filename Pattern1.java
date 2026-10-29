// Hollow Diamond pattern

import java.util.*;

public class Pattern1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();

        if (num < 1) {
                System.out.println("Number must be at least 1.");
                return;
            }

        for(int i = 1; i <=num ; i++){
            for(int j = num-i; j > 0; j-- ){
                System.out.print("   ");
            }
            if(i==1 ){
                System.out.print("1");
            }
            else{
                System.out.print(i);
                for(int k=1; k < (i*2-1); k++){
                    System.out.print("   ");
                }
                System.out.print(i);
            }
            System.out.println();
        }

        for(int i = num-1; i >=1 ; i--){
            for(int j = 0; j < num-i; j++ ){
                System.out.print("   ");
            }
            if(i==1 ){
                System.out.print("1");
            }
            else{
                System.out.print(i);
                for(int k=1; k < (i*2-1); k++){
                    System.out.print("   ");
                }
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}
