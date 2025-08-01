/**Given an array arr[] containing integers and an integer k, your task is to find the length of 
 * the longest subarray where the sum of its elements is equal to the given value k. 
 * If there is no subarray with sum equal to k, return 0. */
import java.util.HashMap;
import java.util.Map;

public class LongSubarray{
    // Approach 1
    public static int longestSubarr(int[] arr, int k){
        int res = 0;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];

                if(sum == k){
                    int subLen = j - i + 1;
                    res = Math.max(res, subLen);
                }
            }
        }
        return res;
    }
    // Approach 2
    // public static int longestSubarr(int[] arr, int k){
    //     Map<Integer, Integer> map = new HashMap<>();
    //     int res = 0, prefix = 0;

    //     for(int i=0; i<arr.length; i++){
    //         prefix += arr[i];

    //         if(prefix == k) res = i + 1;
    //         else if(map.containsKey(prefix - k)){
    //             res = Math.max(res, i - map.get(prefix - k));
    //         }
            
    //         if(!map.containsKey(prefix)){
    //                 map.put(prefix, i);
    //         }
    //     }
    //     return res;
    // }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        System.out.println(LongSubarray.longestSubarr(arr, k));
    }
}