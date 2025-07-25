import java.util.HashSet;
import java.util.Set;

public class UniqueSubarray{
    public static int maxSum(int[] arr){
        Set<Integer> set = new HashSet<>();
        boolean allNeg = true;
        int maxValue = Integer.MIN_VALUE, currSum = 0;
        
        for(int i : arr){
            if(i >= 0){
                allNeg = false;
            }
            if(i > maxValue){
                maxValue = i;
            }
        }
        if(allNeg) return maxValue;

        for(int i : arr){
            set.add(i);
        }
        for(int val : set){
            if(val > 0) currSum += val;
        }
        return currSum;
    }
    public static void main(String... args){
        int[] arr = {1, 2, 3, 4 ,5};
        System.out.println(UniqueSubarray.maxSum(arr));
    }
}