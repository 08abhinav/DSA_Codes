/**Given an array of positive integers nums and a positive integer target, 
 * return the minimal length of a subarray whose sum is greater than or equal to target. 
 * If there is no such subarray, return 0 instead. */
public class MinSizeSub{
    public static int minSubarray(int[] nums, int target){
        int left = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;

        for(int right=0; right<nums.length; right++){
            sum += nums[right];

            while(sum >= target){
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;

    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        System.out.println(MinSizeSub.minSubarray(arr, 7));
    }
}