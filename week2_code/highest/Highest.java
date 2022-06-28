package highest;

public class Highest {

    public static int high(int arr[],int size){
        int high = arr[0];
        for(int i=1;i<size;i++){
            if(high < arr[i]){
                high = arr[i];
            }
        }
        return high;
    }

}
