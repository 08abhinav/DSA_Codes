/*123. Best Time to Buy and Sell Stock III
You are given an array prices where prices[i] is the price of a given stock on the ith day.
Find the maximum profit you can achieve. You may complete at most two transactions.
Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again). */
public class BuySellStockIII{
    public static int maxProfit(int[] prices){
        int buy1 = -prices[0];
        int sell1 = 0;
        int buy2 = -prices[0];
        int sell2 = 0;

        for(int i = 1; i < prices.length; i++){
            int price = prices[i];
            buy1 = Math.max(buy1, -price);
            sell1 = Math.max(sell1, buy1 + price);
            buy2 = Math.max(buy2, sell1 - price);
            sell2 = Math.max(sell2, buy2 + price);
        }
        return sell2;
    }
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 4, 5};
        System.out.println(maxProfit(prices));
    }
}