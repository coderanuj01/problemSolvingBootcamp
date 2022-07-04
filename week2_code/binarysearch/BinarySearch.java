package binarysearch;

public class BinarySearch {

    public static int binary(int listOfNumber[],int sizeOfList,int elementToSearch){

        int high = sizeOfList-1;
        int low = 0;

        int mid;

        while(high >= low){
            mid = (high + low)/2;

            if(listOfNumber[mid] > elementToSearch){
                high = mid-1;
            }else if(listOfNumber[mid] < elementToSearch){
                low = mid + 1;
            }else{
                return mid;
            }
        }

        return -1;

    }

}
