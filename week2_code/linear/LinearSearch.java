package linear;
import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int[] listOfNumber,int sizeOfNumberList,int elementToSearch){
        for(int index=0;index<sizeOfNumberList;index++){
            if(listOfNumber[index] == elementToSearch){
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] listOfNumber = {5,34,23,44,55,32,65,69,65,32,67,94,23};

        Scanner keyboard = new Scanner(System.in);

        while(true){
            System.out.print("Enter a number you want to search (press -1 to quit): ");
            int elementToSearch = keyboard.nextInt();

            if(elementToSearch == -1){
                break;
            }

            if(linearSearch(listOfNumber,listOfNumber.length,elementToSearch) == -1){
                System.out.println("element is not present");
            }else{
                System.out.println("element present");
            }
        }


    }
}
