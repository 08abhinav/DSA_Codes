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
        
    }
}
