import java.util.HashSet;
import java.util.Set;

public class ErasureValue {
    public static int maxUniqueSubarray(int[]nums){
        Set<Integer> set = new HashSet<>();
        int right = 0, left = 0;
        int maxSum = 0, currSum = 0;

        while(right < nums.length){
            if(!set.contains(nums[right])){
                set.add(nums[right]);
                currSum += nums[right];
                maxSum = Math.max(maxSum, currSum);
                right++;
            }else{
                set.remove(nums[left]);
                currSum -= nums[left];
                left++;
            }
        }
        return maxSum;
    }
    public static void main(String...args){
        int[] nums = {5, 2, 1, 5, 2, 1, 1, 2, 5};
        System.out.println(ErasureValue.maxUniqueSubarray(nums));
    }
}
