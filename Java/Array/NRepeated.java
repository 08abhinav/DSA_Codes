/*961. N-Repeated Element in Size 2N Array
You are given an integer array nums with the following properties:
nums.length == 2 * n.
nums contains n + 1 unique elements.
Exactly one element of nums is repeated n times.
Return the element that is repeated n times. */
import java.util.HashSet;
import java.util.Set;

public class NRepeated{
    public static int repeatedNTimes(int[] nums){
        Set<Integer> s = new HashSet<>();
        for(int i : nums){
            if(!s.add(i)){
                return i;
            }
        }
        return nums[nums.length - 1];
    }
    public static void main(String[] args) {
        int[] nums = {5,1,5,2,5,3,5,4};
        System.out.println(repeatedNTimes(nums));
    }
}