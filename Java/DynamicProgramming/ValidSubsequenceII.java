/**You are given an integer array nums and a positive integer k.
A subsequence sub of nums with length x is called valid if it satisfies:

(sub[0] + sub[1]) % k == (sub[1] + sub[2]) % k == ... == (sub[x - 2] + sub[x - 1]) % k.
Return the length of the longest valid subsequence of nums. */
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
        int[] nums = {1, 2, 3, 4};
        int k = 2;
        System.out.println(ValidSubsequenceII.maxLength(nums, k));
    }
}
