package src;

public class CityDistance {

    public static void cityDistances(int sourceCity, int weight, int destinationCity){

        int[][] cityDistancesGraph = new int[][] {
                { 0, 400, 0, 0, 0, 0, 0, 800, 0 },
                { 400, 0, 800, 0, 0, 0, 0, 1100, 0 },
                { 0, 800, 0, 700, 0, 400, 0, 0, 200 },
                { 0, 0, 700, 0, 900, 1400, 0, 0, 0 },
                { 0, 0, 0, 900, 0, 1000, 0, 0, 0 },
                { 0, 0, 400, 1400, 1000, 0, 200, 0, 0 },
                { 0, 0, 0, 0, 0, 200, 0, 100, 600 },
                { 800, 1100, 0, 0, 0, 0, 100, 0, 700 },
                { 0, 0, 200, 0, 0, 0, 600, 700, 0 } };

        MinimumCostPath minimumCostPath = new MinimumCostPath();
        int transferCost = minimumCostPath.minimumCost(cityDistancesGraph,sourceCity,destinationCity);

        int totalShippingCost = transferCost + (transferCost/10)*weight;

        System.out.println("total shipping cost is : " + totalShippingCost);
    }

}
