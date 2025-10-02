class WaterBottles{
    public static int numWaterBottles(int numBottles, int numExchange) {
        int drinked = 0;
        int empty = 0;
        while(numBottles > 0){
            drinked += numBottles;
            empty += numBottles;

            numBottles = empty / numExchange;
            empty = empty % numExchange;
        }
        return drinked;
    }
    public static void main(String... args){
        int numBottles = 15, numExchange = 4;
        System.out.println(WaterBottles.numWaterBottles(numBottles, numExchange));
    }
}