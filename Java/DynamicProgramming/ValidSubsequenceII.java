public class ValidSubsequenceII {
    static int maxLength(int[] nums, int k){
        int n = nums.length;
        if(k == 1) return n;

        int res = 2;
        int[] resArr = new int[n];

        for(int i=0; i<n; i++){
            resArr[i] = nums[i] % k;
        }

        for(int j=0; j<k; j++){
            int[] dp = new int[k];
            for(int i=0; i<n; i++){
                int mod = resArr[i];
                int pos = (j - mod + k) % k;
                dp[mod] = dp[pos] + 1;
                res = Math.max(res, dp[mod]);
            }
        }
        return res;
    }
    public static void main(String... args){

    }
}
