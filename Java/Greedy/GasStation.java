public class GasStation{
    public static int canCompleteCircle(int[] gas, int[] cost){
        int start = 0;
        int currGas = 0, totalGas = 0;
        for(int i = 0; i < gas.length; i++){
            totalGas += gas[i] - cost[i];
            currGas += gas[i] - cost[i];

            if(currGas < 0){
                currGas = 0;
                start = i + 1;
            }
        }
        return (totalGas > 0) ? start : -1;
    }
    public static void main(String... args){
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        System.out.println(GasStation.canCompleteCircle(gas, cost));
    }
}