/*
198. House Robber
You are a professional robber planning to rob houses along a street. Each house has a 
certain amount of money stashed, the only constraint stopping you from robbing each of 
them is that adjacent houses have security systems connected and it will automatically 
contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the 
maximum amount of money you can rob tonight without alerting the police.
*/
public class HouseRobber {
    public static int rob(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int prev = 0, prev2 = 0;
        for(int i : nums){
            int temp = prev;
            prev = Math.max(prev2 + i, prev);
            prev2 = temp;
        }
        return prev;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2};
        System.out.println(HouseRobber.rob(nums));
    }
}
