/*
We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.
Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences. 
*/
import java.util.Arrays;

public class LongestHarmonious{
    public static int longestHarmoniousSubsequence(int[] nums){
        Arrays.sort(nums);
        int j = 0, maxLength = 0;
        for(int i=0; i<nums.length; i++){
            while(nums[i] - nums[j] > 1){
                j++;
            }
            if(nums[i] - nums[j] == 1){
                maxLength = Math.max(maxLength, i - j + 1);
            }
        }
        return maxLength;
    }
    public static void main(String... args){
        int[] arr = {1,3,2,2,5,2,3,7};
        System.out.println(LongestHarmonious.longestHarmoniousSubsequence(arr));
    }
}