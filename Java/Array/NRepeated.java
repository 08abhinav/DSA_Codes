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