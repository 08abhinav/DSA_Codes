class WaterBottleII{
    public static int maxBottleDrunk(int numBottles, int numExchange){
        int empty = numBottles;
        while(empty >= numExchange){
            empty -= numExchange;
            numBottles += 1;
            numExchange += 1;
            empty += 1;
        }
        return numBottles;
    }
    public static void main(String... ags){
        int numBottles = 13, numExchange = 6;
        System.out.println(WaterBottleII.maxBottleDrunk(numBottles, numExchange));
    }
}