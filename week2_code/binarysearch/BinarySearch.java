package binarysearch;

public class BinarySearch {

    public static int binary(int arr[],int size,int ele){

        int high = size-1;
        int low = 0;

        int mid;

        while(high >= low){
            mid = (high + low)/2;

            if(arr[mid] > ele){
                high = mid-1;
            }else if(arr[mid] < ele){
                low = mid + 1;
            }else{
                return mid;
            }
        }

        return -1;

    }

}
