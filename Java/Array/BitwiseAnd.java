public class BitwiseAnd{
    public static int longestSubarray(int[] nums){
        int maxLen = 0, currLen = 0, maxVal = 0;
        for(int i : nums){
            maxVal = Math.max(maxVal, i);
        }

        for(int i : nums){
            if(i == maxVal){
                currLen++;
                maxLen = Math.max(maxLen, currLen);
            }else{
                currLen = 0;
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 2, 2};
        System.out.println(BitwiseAnd.longestSubarray(nums));
    }
}