package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Comparison {
    static void compare(Task arr[],int n){
        Arrays.sort(arr, new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.finish- o2.finish;
            }
        });
    }
}
