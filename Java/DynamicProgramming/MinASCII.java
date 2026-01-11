public class MinASCII {
    public static int minDelete(String s1, String s2){
        int n = s1.length(), m = s2.length();
        int [][]dp = new int[n + 1][m + 1];

        for(int i = n - 1; i >= 0; i--){
            for(int j = m - 1; j >= 0; j--){
                if(s1.charAt(i) == s2.charAt(j)){
                    dp[i][j] = s1.charAt(i) + dp[i + 1][j + 1];
                }else{
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        int total = 0;
        for(char c : s1.toCharArray()) total += c;
        for(char c : s2.toCharArray()) total += c;

        return total - 2 * dp[0][0];
    }
    public static void main(String...args){
        String s1 = "sea", s2 = "eat";
        System.out.println(minDelete(s1, s2));
    }
}
