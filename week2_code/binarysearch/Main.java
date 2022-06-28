package binarysearch;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = {12,23,34,45,56,67,78,89,91};

        BinarySearch bs = new BinarySearch();

        Scanner keyboard = new Scanner(System.in);

        while(true){
            System.out.print("Enter a number you want to search (press -1 to quit): ");
            int ele = keyboard.nextInt();

            if(ele == -1){
                break;
            }

            if(bs.binary(arr,arr.length,ele) == -1){
                System.out.println("element is not present");
            }else{
                System.out.println("element present");
            }
        }
    }
}
