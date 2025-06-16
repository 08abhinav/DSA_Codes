import java.util.Arrays;
import java.util.HashMap;

public class FreqSort{
    public int[] freqSort(int[] arr){
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

    }
}