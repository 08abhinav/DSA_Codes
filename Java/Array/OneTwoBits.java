/*717. 1-bit and 2-bit Characters
We have two special characters:

The first character can be represented by one bit 0.
The second character can be represented by two bits (10 or 11).
Given a binary array bits that ends with 0, return true if the last character must be a one-bit character*/
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
        int[] bits = {1, 1, 1, 0};
        System.out.println(isOneBitCharacter(bits));
    }
}
