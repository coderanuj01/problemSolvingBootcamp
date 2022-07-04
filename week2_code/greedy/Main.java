package greedy;

public class Main {

    public static void main(String[] args) {
        int numerOfTask = 10;

        Task listOfTask[] = new Task[numerOfTask];

        listOfTask[0] = new Task(5,9);
        listOfTask[1] = new Task(1,2);
        listOfTask[2] = new Task(2,6);
        listOfTask[3] = new Task(3,9);
        listOfTask[4] = new Task(2,4);
        listOfTask[5] = new Task(1,7);
        listOfTask[6] = new Task(2,5);
        listOfTask[7] = new Task(3,5);
        listOfTask[8] = new Task(2,4);
        listOfTask[9] = new Task(2,7);

        Implementation impl = new Implementation();

        impl.printMaxActivities(listOfTask,numerOfTask);

    }

}
