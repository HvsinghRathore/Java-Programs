import java.util.Scanner;

public class Array2 {
    public static void main(String[] args)
    {
        int[] pos = new int[10];
        int[] neg = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 positive numbers for array");
        for(int i=0; i<=9; i++){
            int num = sc.nextInt();
            if(num <= 0){
                System.out.println("invalid Choise");
                i--;
                continue;
            }
            pos[i]=num;
        }

        System.out.println("Enter 10 negative numbers for array");
        for(int i=0; i<=9; i++){
            int num = sc.nextInt();
            if(num >= 0){   
                System.out.println("invalid Choise");
                i--;
                continue;
            }
            neg[i]=num;
        }

        int ans = pos[0]+neg[0];
        int posNum = pos[0];
        int negNum = neg[0];
        if (ans < 0) 
            ans = -ans;

        for(int i=0; i<pos.length; i++){
            for(int j=0; j<neg.length;j++){
                int temp =pos[i]+neg[j];
                if (temp < 0) 
                    temp = -temp;
                if(ans>temp){
                    posNum = pos[i];
                    negNum = neg[j];
                    ans = temp;
                }
                if(ans == 0)
                    break;
            }
        }
        System.out.println("Pair is " + posNum + " " + negNum);
    }
}
