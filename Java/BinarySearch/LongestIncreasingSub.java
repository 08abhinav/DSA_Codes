package Java.BinarySearch;

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
    public static void main(String[] args) {
        
    }
}
