public class SmoothDescent {
    public static long getDescentPeriod(int[] prices){
        long res = 1, count = 1;
        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i] == (prices[i + 1] + 1)){
                count += 1;
            }else{
                count = 1;
            }
            res += count;
        }
        return res;
    }
    public static void main(String... args){
        int[] prices = {5, 3, 2, 1, 7, 6};
        System.out.println(getDescentPeriod(prices));
    }
}
