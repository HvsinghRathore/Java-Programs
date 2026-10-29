public class Array3 {
    public static void main(String args[]){
        int[] array = {1,5,78,65,54,9,3,34,76};

        for(int i=0; i<array.length; i++){

            for(int j=0; j<array.length-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        int[] low_high = array.clone();
        for(int i=0; i<array.length; i++){

            for(int j=0; j<array.length-1; j++){
                if(array[j] < array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
 
        } 
        int[] high_low = array.clone();
        int highCount = 0;
        int lowCount = 0;

        for(int i=0; i<array.length; i++){
            if(i%2==0){
                array[i]=high_low[highCount];
                highCount++;
            }
            else{
                array[i]=low_high[lowCount];
                lowCount++;
            }
        }
        for(int num:array){
            System.out.print(num + "  ");
        }

    }
}
