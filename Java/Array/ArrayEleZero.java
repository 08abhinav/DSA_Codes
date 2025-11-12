/*2654. Minimum Number of Operations to Make All Array Elements Equal to 1

You are given a 0-indexed array nums consisiting of positive integers. You can do the following operation 
on the array any number of times:

Select an index i such that 0 <= i < n - 1 and replace either of nums[i] or nums[i+1] with their gcd value.
Return the minimum number of operations to make all elements of nums equal to 1. If it is impossible, return -1.
The gcd of two integers is the greatest common divisor of the two integers. */
public class ArrayEleZero{
    public static int minOps(int[] nums){
        int n = nums.length;
        int countOnes = 0;
        
        for(int x : nums){
            if(x == 1) countOnes += 1;
        }
        
        if(countOnes > 0) return n - countOnes;

        int minLen = 99;
        for(int i = 0; i < n; i++){
            int g = nums[i];
            for(int j = i; j < n; j++){
                g = gcd(g, nums[j]);
                if(g == 1){
                    minLen = Math.min(minLen, j - i + 1);
                    break;
                }
            }
        }
        if(minLen == 99) return -1;
        return (minLen - 1) + (n - 1);

    }

    private static int gcd(int a, int b){
        return b == 0 ? a : gcd(b, b % a);
    }
    public static void main(String[] args) {
        int[] nums = {2, 6, 3, 4};
        System.out.println(minOps(nums));
    }
}