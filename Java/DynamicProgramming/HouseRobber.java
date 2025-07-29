public class HouseRobber {
    public static int rob(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int prev = 0, prev2 = 0;
        for(int i : nums){
            int temp = prev;
            prev = Math.max(prev2 + i, prev);
            prev2 = prev;
        }
        return prev;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2};
        System.out.println(HouseRobber.rob(nums));
    }
}
