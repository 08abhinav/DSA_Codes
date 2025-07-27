/**You are given a 0-indexed integer array nums. 
 * An index i is part of a hill in nums if the closest non-equal neighbors of i are smaller than nums[i]. 
 * Similarly, an index i is part of a valley in nums if the closest non-equal neighbors of i are larger 
 * than nums[i]. Adjacent indices i and j are part of the same hill or valley if nums[i] == nums[j].

Note that for an index to be part of a hill or valley, it must have a non-equal neighbor on both the 
left and right of the index.

Return the number of hills and valleys in nums. */
public class HillValley{
    public static int countHillValley(int[] nums){
        int res = 0, left = 0;
        for(int i = 1; i < nums.length - 1; i++){
             if (nums[i] != nums[i + 1]) {
                if ((nums[i] > nums[left] && nums[i] > nums[i + 1]) || 
                    (nums[i] < nums[left] && nums[i] < nums[i + 1])) {
                    res++;
                }
                left = i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 1, 6, 5};
        System.out.println(HillValley.countHillValley(nums));
    }
}