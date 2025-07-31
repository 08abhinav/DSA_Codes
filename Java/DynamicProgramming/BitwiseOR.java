/**898. Bitwise ORs of Subarrays
Given an integer array arr, return the number of distinct bitwise ORs of all the non-empty subarrays of arr.

The bitwise OR of a subarray is the bitwise OR of each integer in the subarray. 
The bitwise OR of a subarray of one integer is that integer.

A subarray is a contiguous non-empty sequence of elements within an array. */
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