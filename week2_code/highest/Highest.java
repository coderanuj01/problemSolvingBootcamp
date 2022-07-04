package highest;

public class Highest {

    public static int high(int listOfNumber[],int sizeOfList){
        int high = listOfNumber[0];
        for(int index=1;index<sizeOfList;index++){
            if(high < listOfNumber[index]){
                high = listOfNumber[index];
            }
        }
        return high;
    }

}
