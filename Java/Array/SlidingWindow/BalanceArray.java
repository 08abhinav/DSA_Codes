public class BalanceArray{
    public static int minRemoval(int[] nums, int k){
        Arays.sort(nums);
        int l = 0, maxLen = 0;
        for(int r = 0; r < nums.length; r++){
            while((long)nums[r] > nums[l] * k){
                l += 1
            }
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return nums.length - maxLen;
    }
    public static void main(String... args){
        
    }
}