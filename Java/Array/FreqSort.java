/**Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.

Return the sorted array. */
import java.util.Arrays;
import java.util.HashMap;

public class FreqSort{
    public static int[] freqSort(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        return Arrays.stream(arr)
            .boxed()
            .sorted((a, b)-> map.get(a) != map.get(b) ? map.get(a) - map.get(b) : (b-a))
            .mapToInt(n -> n)
            .toArray();
    }
    public static void main(String... args){
        int[] arr = {1, 1, 2, 2, 2, 3};
        System.out.println(Arrays.toString(FreqSort.freqSort(arr)));
    }
}