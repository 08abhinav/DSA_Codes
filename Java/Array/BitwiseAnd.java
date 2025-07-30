/**2419. Longest Subarray With Maximum Bitwise AND
You are given an integer array nums of size n.

Consider a non-empty subarray from nums that has the maximum possible bitwise AND.

In other words, let k be the maximum value of the bitwise AND of any subarray of nums. 
Then, only subarrays with a bitwise AND equal to k should be considered. Return the 
length of the longest such subarray.

The bitwise AND of an array is the bitwise AND of all the numbers in it.

A subarray is a contiguous sequence of elements within an array. */
public class BitwiseAnd{
    public static int longestSubarray(int[] nums){
        int maxLen = 0, currLen = 0, maxVal = 0;
        for(int i : nums){
            maxVal = Math.max(maxVal, i);
        }

        for(int i : nums){
            if(i == maxVal){
                currLen++;
                maxLen = Math.max(maxLen, currLen);
            }else{
                currLen = 0;
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 2, 2};
        System.out.println(BitwiseAnd.longestSubarray(nums));
    }
}