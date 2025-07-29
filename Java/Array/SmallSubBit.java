/**2411. Smallest Subarrays With Maximum Bitwise OR
You are given a 0-indexed array nums of length n, consisting of non-negative integers. 
For each index i from 0 to n - 1, you must determine the size of the minimum sized non-empty 
subarray of nums starting at i (inclusive) that has the maximum possible bitwise OR.

In other words, let Bij be the bitwise OR of the subarray nums[i...j]. You need to find the 
smallest subarray starting at i, such that bitwise OR of this subarray is equal to max(Bik) 
where i <= k <= n - 1. The bitwise OR of an array is the bitwise OR of all the numbers in it.

Return an integer array answer of size n where answer[i] is the length of the minimum sized 
subarray starting at i with maximum bitwise OR.

A subarray is a contiguous non-empty sequence of elements within an array. */
import java.util.Arrays;

public class SmallSubBit{
    public static int[] smallestSubarray(int[]nums){
        int n = nums.length;
        int[] res = new int[n];

        for(int i = 0; i < n; i++){
            res[i] = 1;
            for(int j = i - 1; j >= 0; j--){
                if((nums[j] | nums[i]) == nums[j])break;
                nums[j] |= nums[i];
                res[j] = i - j + 1;
            }   
        }
        return res;
    }
    public static void main(String...args){
        int[] nums = {1,0,2,1,3};
        System.out.println(Arrays.toString(SmallSubBit.smallestSubarray(nums)));
    }
}