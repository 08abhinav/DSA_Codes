/**300. Longest Increasing Subsequence

Given an integer array nums, return the length of the longest strictly increasing subsequence. */
package Subsequence;

import java.util.Arrays;

public class LongestIncreaseSub {
    public static int lengthOfLIS(int[] nums){
        int n = nums.length;
        if(n == 0) return 0;
        
        int dp[] = new int[n];
        Arrays.fill(dp, 1);
        int maxLen = 1;

        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(LongestIncreaseSub.lengthOfLIS(nums));
    }
}
