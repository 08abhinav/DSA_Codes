/**Given an array of integers arr, a lucky integer is an integer that has a frequency 
 * in the array equal to its value.

Return the largest lucky integer in the array. If there is no lucky integer return -1. */
import java.util.HashMap;
import java.util.Map;

public class LuckyInteger{
    public static int findLucky(int[] arr){
        Map<Integer, Integer> freq = new HashMap<>();
        int luckyInt = -1;
        for(int i : arr){
            freq.put(i, freq.getOrDefault(freq, 0) + 1);
        }

        for(int key : freq.keySet()){
            if(freq.get(key) == key){
                luckyInt = key;
            }
        }
        return luckyInt;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3};
        System.out.println(LuckyInteger.findLucky(arr));
    }
}