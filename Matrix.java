import java.util.*;

public class Matrix {
    public static void main(String[] args){
        int[][] arr = new int[5][5];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<arr.length; i++){
            System.out.println("Enter vales for " +i+ " array");

            for(int j=0; j<arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<arr.length; i++){
            boolean sorted = true;

            for(int j=0; j<arr.length-1; j++){
                if(arr[i][j]>arr[i][j+1]){
                    sorted = false;
                    continue;
                }
            }

            for (int k=0; k<arr.length; k++){
                System.out.print(arr[i][k]+" ");
            }
            
            System.out.println(sorted);
        }
        
    }
}
