/*
1518. Water Bottles
There are numBottles water bottles that are initially full of water. You can exchange numExchange empty 
water bottles from the market with one full water bottle.

The operation of drinking a full water bottle turns it into an empty bottle.
Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink. 
*/
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