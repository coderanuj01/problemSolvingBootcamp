package greedy;

public class Implementation {
    static void printMaxActivities(Task listOfTask[],int numerOfTask){

        Comparison.compare(listOfTask, numerOfTask);
        System.out.println("these tasks are selected : ");

        int addingIndex=0;
        System.out.println( " ( " + listOfTask[addingIndex].start + " " + listOfTask[addingIndex].finish + " ),");

        for(int index=1;index<numerOfTask;index++){
            if(listOfTask[index].start >= listOfTask[addingIndex].finish){
                System.out.println(" ( " + listOfTask[index].start + " " + listOfTask[index].finish + " ),");
                addingIndex = index;
            }
        }
    }
}
