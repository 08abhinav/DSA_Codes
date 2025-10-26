import java.util.HashMap;
import java.util.Map;

public class SubarrayKDifferentInt{
    public static int kDistinct(int[] nums, int k){
        int subWithMaxK = atMostK(nums, k);
        int reducedSubWithMaxK = atMostK(nums, k - 1);
        return subWithMaxK - reducedSubWithMaxK;
    }

    public static int atMostK(int[] nums, int K){
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, right = 0, ans = 0;
        
        while (right < nums.length) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            
            while (map.size() > K) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }
            
            ans += right - left + 1; 
            right++;
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,4};
        int k = 3;
        System.out.println(SubarrayKDifferentInt.kDistinct(nums, k));
    }
}