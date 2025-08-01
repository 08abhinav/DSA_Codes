package Java.BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSub {
    public static int lengthOfLIS(int[] nums){
        List<Integer> res = new ArrayList<>();
        for(int n : nums){
            if(res.isEmpty() || res.get(res.size() - 1) < n){
                res.add(n);
            }else{
                int idx = binarySearch(res, n);
                res.set(idx, n);
            }
        }
        return res.size();
    }

    public static int binarySearch(List<Integer> arr, int target){
        int left = 0, right = arr.size() - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(arr.get(mid) == target){
                return mid;
            }else if(arr.get(mid) > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        
    }
}
