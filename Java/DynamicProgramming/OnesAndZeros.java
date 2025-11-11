/*474. Ones and Zeroes
You are given an array of binary strings strs and two integers m and n.

Return the size of the largest subset of strs such that there are at most m 0's and n 1's in the subset.

A set x is a subset of a set y if all elements of x are also elements of y. */
public class OnesAndZeros{
    public static int findMaxForm(String[] strs, int m, int n){
        int[][] dp = new int[m + 1][n + 1];
        for(String s : strs){
            int zeros = 0, ones = 0;
            for(char ch : s.toCharArray()){
                if(ch == '0') zeros += 1;
                else ones += 1;
            }

            for(int i = m; i >= zeros; i--){
                for(int j = n; j >= ones; j--){
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeros][j - ones] + 1);
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        String strs[] = {"10","0001","111001","1","0"};
        int m = 5, n = 3;
        System.out.println(findMaxForm(strs, m, n));
    }
}