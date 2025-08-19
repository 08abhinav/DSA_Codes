/**2348. Number of Zero-Filled Subarrays
Given an integer array nums, return the number of subarrays filled with 0.

A subarray is a contiguous non-empty sequence of elements within an array. */
public class ZeroFilledSub {
    public static long zeroFillSub(int[] nums){
        int count = 0, ans = 0;
        for(int i : nums){
            if(i == 0){
                count++;
                ans += count;
            }else{
                count = 0;
            }
        }
        return ans;
    }
    public static void main(String...args){
        int[] nums = {1, 3, 0, 0, 2, 0, 0, 4};
        System.err.println(ZeroFilledSub.zeroFillSub(nums));;
    }
}
