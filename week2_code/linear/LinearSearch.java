package linear;
import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int[] array,int size,int ele){
        for(int i=0;i<size;i++){
            if(array[i] == ele){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5,34,23,44,55,32,65,69,65,32,67,94,23};

        Scanner keyboard = new Scanner(System.in);

        while(true){
            System.out.print("Enter a number you want to search (press -1 to quit): ");
            int ele = keyboard.nextInt();

            if(ele == -1){
                break;
            }

            if(linearSearch(arr,arr.length,ele) == -1){
                System.out.println("element is not present");
            }else{
                System.out.println("element present");
            }
        }


    }
}
