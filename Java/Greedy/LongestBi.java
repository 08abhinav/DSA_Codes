public class LongestBi {
    public static int longestSubsequence(String s, int k){
        int n = s.length();
        int cnt = 0;
        int power = 0;
        int val = 0;
        for(int i=n-1; i>=0; i--){
            char c = s.charAt(i);
            if(c == '1'){
                cnt++;
            }else{
                if(power < 32){
                    long add = 1L << power;
                    if(val + add <= k){
                        val += add;
                        cnt++;
                    }
                }
            }
            power++;
        }
        return cnt;
    }
    public static void main(String... args){
        String s = "1001010";
        int k = 5;
        System.out.println(LongestBi.longestSubsequence(s, k));
    }
}
