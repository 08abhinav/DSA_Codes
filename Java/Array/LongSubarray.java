import java.util.HashMap;
import java.util.Map;

public class LongSubarray{
    public static int longestSubarr(int[] arr, int k){
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0, prefix = 0;

        for(int i=0; i<arr.length; i++){
            prefix += arr[i];

            if(prefix == k) res = i + 1;
            else if(map.containsKey(prefix - k)){
                res = Math.max(res, i - map.get(prefix - k));
            }
            
            if(!map.containsKey(prefix)){
                    map.put(prefix, i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}