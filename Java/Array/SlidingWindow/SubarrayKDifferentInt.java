/*992. Subarrays with K Different Integers
Given an integer array nums and an integer k, return the number of good subarrays of nums.

A good array is an array where the number of different integers in that array is exactly k.

For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.
A subarray is a contiguous part of an array. */
import java.util.HashMap;
import java.util.Map;

public class SubarrayKDifferentInt{
    public static int kDistinct(int[] nums, int k){
        int subWithMaxK = atMostK(nums, k);
        int reducedSubWithMaxK = atMostK(nums, k - 1);
        return subWithMaxK - reducedSubWithMaxK;
    }

    public static int atMostK(int[] nums, int K){
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, right = 0, ans = 0;
        
        while (right < nums.length) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            
            while (map.size() > K) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }
            
            ans += right - left + 1; 
            right++;
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,4};
        int k = 3;
        System.out.println(SubarrayKDifferentInt.kDistinct(nums, k));
    }
}