package src;

public class MinimumCostPath {

    int minimumCost(int[][] cityDistancesGraph, int sourceCity, int destinationCity)
    {
        int[] distance = new int[9];

        Boolean[] sptSet = new Boolean[9];


        for (int index = 0; index < 9; index++) {
            distance[index] = Integer.MAX_VALUE;
            sptSet[index] = false;
        }

        distance[sourceCity] = 0;


        for (int count = 0; count < 8; count++) {

            int u = MinimumDistance.minimumDistance(distance, sptSet);

            sptSet[u] = true;

            for (int vertex = 0; vertex < 9; vertex++)
                if (!sptSet[vertex] && cityDistancesGraph[u][vertex] != 0 && distance[u] != Integer.MAX_VALUE &&
                        distance[u] + cityDistancesGraph[u][vertex] < distance[vertex])
                    distance[vertex] = distance[u] + cityDistancesGraph[u][vertex];
        }

        return distance[destinationCity];

    }

}
