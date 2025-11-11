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