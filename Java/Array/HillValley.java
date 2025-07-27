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