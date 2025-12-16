/*581. Shortest Unsorted Continuous Subarray
Given an integer array nums, you need to find one continuous subarray such that if you only sort 
this subarray in non-decreasing order, then the whole array will be sorted in non-decreasing order.

Return the shortest such subarray and output its length. */
public class ShortestUnsorted {
    public static int findUnsortedArray(int[] nums){
        int n = nums.length, end = -2, beg = -1, max = nums[0], min = nums[n - 1];
        for(int i = 1; i < n; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[n - 1 - i]);
            if(nums[i] < max) end = i;
            if(nums[n - 1 - i] > min) beg = n - 1 - i;
        }
        return end - beg + 1;
    }
    public static void main(String... args){
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        System.out.println(findUnsortedArray(nums));
    }
}
