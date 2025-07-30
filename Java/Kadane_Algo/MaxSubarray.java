public class MaxSubarray {
    public static int maxSubArray(int[] nums){
        int currSum = 0, maxSum = Integer.MIN_VALUE;

        for(int i : nums){
            currSum += i;
            maxSum = Math.max(maxSum, currSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaxSubarray.maxSubArray(nums));
    }
}
