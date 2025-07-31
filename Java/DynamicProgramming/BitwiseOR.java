import java.util.HashSet;
import java.util.Set;

public class BitwiseOR{
    // Approach 1
    // public static int subarrayBitwise(int[] arr){
    //     Set<Integer> res = new HashSet<>();
    //     for(int i = 0; i < arr.length; i++){
    //         res.add(arr[i]);
    //         for(int j = i-1; j >= 0; j--){
    //             if(arr[j] == (arr[j] | arr[i]))break;
    //             arr[j] |= arr[i];
    //             res.add(arr[j]);
    //         }
    //     }
    //     return res.size();
    // }

    // Approach 2
    public static int subarrayBitwise(int[] arr){
        Set<Integer> resOr = new HashSet<>();
        Set<Integer> currOr = new HashSet<>();

        for(int i : arr){
            Set<Integer> nextOr = new HashSet<>();
            nextOr.add(i);
            for(int j : currOr){
                nextOr.add(j | i);
            }
            resOr.addAll(nextOr);
            currOr = nextOr;
        }
        return resOr.size();
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        System.out.println(BitwiseOR.subarrayBitwise(arr));
    }
}