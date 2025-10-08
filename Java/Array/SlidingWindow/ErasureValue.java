package SlidingWindow;
/**You are given an array of positive integers nums and want to erase a subarray containing unique elements. 
 * The score you get by erasing the subarray is equal to the sum of its elements.

Return the maximum score you can get by erasing exactly one subarray.

An array b is called to be a subarray of a if it forms a contiguous subsequence of a, that is, 
if it is equal to a[l],a[l+1],...,a[r] for some (l,r). */
import java.util.HashSet;
import java.util.Set;

public class ErasureValue {
    // Approach 1 using Set
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

    // Approach 2 using Frequency count
    // public static int maxUniqueSubarray(int[] nums){
    //     int freq[] = new int[10001];
    //     int right = 0, left = 0;
    //     int maxSum = 0, currSum = 0;

    //     for(right=0; right<nums.length; right++){
    //         int temp = nums[right];

    //         while(freq[temp] > 0){
    //             freq[nums[left]]--;
    //             currSum -= nums[left];
    //             left++;
    //         }

    //         freq[temp]++;
    //         currSum += temp;
    //         maxSum = Math.max(maxSum, currSum);
    //     }
    //     return maxSum;
    // }
    public static void main(String...args){
        int[] nums = {5, 2, 1, 5, 2, 1, 1, 2, 5};
        System.out.println(ErasureValue.maxUniqueSubarray(nums));
    }
}
