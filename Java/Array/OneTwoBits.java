package Java.Array;

public class OneTwoBits {
    public static boolean isOneBitCharacter(int[] nums){
        int i = 0, n = nums.length;
        while(i < n - 1){
            i += nums[i] + 1;
        }
        return i == n - 1;
    }
    public static void main(String... args){

    }
}
