/*1590. Make Sum Divisible by P
Given an array of positive integers nums, remove the smallest subarray (possibly empty) such that the 
sum of the remaining elements is divisible by p. It is not allowed to remove the whole array.

Return the length of the smallest subarray that you need to remove, or -1 if it's impossible.

A subarray is defined as a contiguous block of elements in the array. */
import java.util.HashMap;
import java.util.Map;

public class SumDivisibleByP {
    public static int minSubarray(int[] nums, int p) {
        long total = 0;
        for (int num : nums) total += num;

        long target = total % p;
        if (target == 0) return 0;

        Map<Integer, Integer> mMap = new HashMap<>();
        mMap.put(0, -1);

        long prefix = 0;
        int res = nums.length;

        for (int i = 0; i < nums.length; i++) {
            prefix = (prefix + nums[i]) % p;
            int need = (int)((prefix - target + p) % p);

            if (mMap.containsKey(need)) {
                res = Math.min(res, i - mMap.get(need));
            }

            mMap.put((int)prefix, i);
        }

        return res == nums.length ? -1 : res;
    }

    public static void main(String... args){
        int nums[] = {3, 1, 4, 2};
        int p = 6;
        System.out.println(minSubarray(nums, p));
    }
}
