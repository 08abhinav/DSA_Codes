/**Given a binary array nums and an integer k, return the maximum number of consecutive 1's in t
 * he array  you can flip at most k 0's. */
public class ConsecutiveOnes {
    public static int longestOnes(int[] nums, int k){
        int left = 0, maxLen = 0, zeroCount = 0;

        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0) zeroCount++;

            while(zeroCount > k){
                if(nums[left] == 0) zeroCount--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println(ConsecutiveOnes.longestOnes(nums, k));
    }
}
