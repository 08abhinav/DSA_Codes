import java.util.HashMap;
import java.util.Map;

public class SubarrayKDifferentInt{
    public static int kDistinct(int[] nums, int k){
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }

    public static int atMostK(int[] nums, int K){
        int left = 0, right = 0, res = 0;
        Map<Integer, Integer> count = new HashMap<>();
        
        while(right < nums.length){
            count.put(nums[right], count.getOrDefault(count, 0) + 1);

            while(count.size() > K){
                count.put(nums[left], count.get(nums[left]) - 1);
                if(count.get(nums[left]) == 0){
                    count.remove(nums[left]);
                }
                left += 1;
            }
            res += right - left  + 1;
            right += 1;
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}