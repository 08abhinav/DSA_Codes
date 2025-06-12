public class MaxDiff{
    public static int maxDifference(int[] nums){
        int maxDiff = 0;
        for(int i=0; i<nums.length-1; i++){
            maxDiff = Math.max(maxDiff, Math.abs(nums[i+1] - nums[i]));
            maxDiff = Math.max(maxDiff, Math.abs(nums[nums.length-1] - nums[0]));
        }
        return maxDiff;
    }
    public static void main(String[] args) {
        
    }
}