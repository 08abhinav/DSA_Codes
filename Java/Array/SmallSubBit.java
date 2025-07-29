public class SmallSubBit{
    public static int[] smallestSubarray(int[]nums){
        int n = nums.length;
        int[] res = new int[n];

        for(int i = 0; i < n; i++){
            res[i] = 1;
            for(int j = i - 1; j >= 0; j--){
                if((nums[j] | nums[i]) == nums[j])break;
                nums[j] |= nums[i];
                res[j] = i - j + 1;
            }   
        }
        return res;
    }
    public static void main(String...args){

    }
}