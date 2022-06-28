package greedy;

public class Implementation {
    static void printMaxActivities(Task arr[],int n){
        Comparison cmp = new Comparison();
        cmp.compare(arr, n);
        System.out.println("these tasks are selected : ");

        int i=0;
        System.out.println( " ( " + arr[i].start + " " + arr[i].finish + " ),");

        for(int j=1;j<n;j++){
            if(arr[j].start >= arr[i].finish){
                System.out.println(" ( " + arr[j].start + " " + arr[j].finish + " ),");
                i = j;
            }
        }
    }
}
