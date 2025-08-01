/**You are given a circular array arr[] of integers, find the maximum possible sum of a non-empty subarray. 
 * In a circular array, the subarray can start at the end and wrap around to the beginning. Return the maximum 
 * non-empty subarray sum, considering both non-wrapping and wrapping cases. */
public class MaxCircular{
    public static int maxCircularSum(int[] arr){
        int totalSum = 0;
        int maxSum = arr[0], minSum = 0;
        int currMax = 0, currMin = 0;

        for(int i = 0; i < arr.length; i++){
            currMax = Math.max(currMax + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(currMin + arr[i], arr[i]);
            minSum = Math.min(minSum, currMin);

            totalSum += arr[i];
        }

        int sum = maxSum;
        int circularSum = totalSum - minSum;

        if(minSum == totalSum) return sum;

        return Math.max(sum, circularSum);
    }
    public static void main(String[] args) {
       int[] nums = {8, -8, 9, -9, 10, -11, 12};
       System.out.println(MaxCircular.maxCircularSum(nums));
    }
}