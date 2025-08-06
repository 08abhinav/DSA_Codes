/**
643. Maximum Average Subarray I
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. 
Any answer with a calculation error less than 10-5 will be accepted. */
public class MaxSubarrayAvg {
    public static double findMaxAvg(int[] nums, int k){
        double maxSum = 0, sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        maxSum = sum;
        for(int i = k; i < nums.length; i++){
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum / k;
    }
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(MaxSubarrayAvg.findMaxAvg(nums, k));
    }
}
