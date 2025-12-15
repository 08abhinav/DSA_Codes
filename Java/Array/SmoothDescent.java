/*2110. Number of Smooth Descent Periods of a Stock
You are given an integer array prices representing the daily price history of a stock, 
where prices[i] is the stock price on the ith day.

A smooth descent period of a stock consists of one or more contiguous days such that the 
price on each day is lower than the price on the preceding day by exactly 1. The first day 
of the period is exempted from this rule.

Return the number of smooth descent periods. */
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
