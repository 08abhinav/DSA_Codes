/*523. Continuous Subarray Sum
Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.

A good subarray is a subarray where:
its length is at least two, and
the sum of the elements of the subarray is a multiple of k.
Note that:

A subarray is a contiguous part of the array.
An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k. */
import java.util.HashMap;

public class ContiguousSum{
    public static boolean checkSubArray(int[]nums, int k){
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int prefixSum = 0;
        for(int i = 0; i < n; i++){
            prefixSum += nums[i];
            int remain = prefixSum % k;
            if(map.containsKey(remain)){
                if(i - map.get(remain) >= 2){
                    return true;
                }
            }else{
                map.put(remain, i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {23,2,6,4,7};
        int k = 6;
        System.out.println(checkSubArray(nums, k));
    }
}