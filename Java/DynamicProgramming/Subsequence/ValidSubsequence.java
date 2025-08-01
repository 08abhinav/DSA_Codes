package Subsequence;
/**You are given an integer array nums.
A subsequence sub of nums with length x is called valid if it satisfies:

(sub[0] + sub[1]) % 2 == (sub[1] + sub[2]) % 2 == ... == (sub[x - 2] + sub[x - 1]) % 2.
Return the length of the longest valid subsequence of nums.

A subsequence is an array that can be derived from another array by deleting some or no elements 
without changing the order of the remaining elements. */
public class ValidSubsequence{
    static int maxLength(int[] nums){
        int countEven = 0, countOdd = 0;

        for(int num : nums){
            if(num % 2 == 0) countEven++;
            else countOdd++;
        }

        int evenDp = 0, oddDp = 0;
        for(int num : nums){
            if(num % 2 == 0){
                evenDp = Math.max(evenDp, oddDp + 1);
            }else{
                oddDp = Math.max(oddDp, evenDp + 1);
            }
        }

        return Math.max(Math.max(evenDp, oddDp), Math.max(countEven, countOdd));
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(ValidSubsequence.maxLength(nums));
    }
}