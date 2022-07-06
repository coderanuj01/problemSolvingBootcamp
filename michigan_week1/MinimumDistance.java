package src;

public class MinimumDistance {

    public static int minimumDistance(int[] dist, Boolean[] sptSet)
    {

        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int vertex = 0; vertex < 9; vertex++)
            if (!sptSet[vertex] && dist[vertex] <= min) {
                min = dist[vertex];
                minIndex = vertex;
            }

        return minIndex;
    }
}
