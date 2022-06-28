package highest;

public class Main {
    public static void main(String[] args) {
        Highest highest = new Highest();

        int arr[] = {23,43,54,22,56,43,13,65,32,76,43,21,56,32,52,12};

        int highestElement = highest.high(arr,arr.length);

        System.out.println("Highest element in array is : " + highestElement);
    }
}
