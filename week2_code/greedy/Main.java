package greedy;

public class Main {

    public static void main(String[] args) {
        int n = 10;

        Task arr[] = new Task[n];

        arr[0] = new Task(5,9);
        arr[1] = new Task(1,2);
        arr[2] = new Task(2,6);
        arr[3] = new Task(3,9);
        arr[4] = new Task(2,4);
        arr[5] = new Task(1,7);
        arr[6] = new Task(2,5);
        arr[7] = new Task(3,5);
        arr[8] = new Task(2,4);
        arr[9] = new Task(2,7);

        Implementation impl = new Implementation();

        impl.printMaxActivities(arr,n);

    }

}
