import java.util.HashMap;
import java.util.Map;

public class EvenOddChars{
    public static int absDiff(String s){
        Map<Character, Integer> freq = new HashMap<>();
        
        for(char c : s.toCharArray()){
            freq.put(c, freq.getOrDefault(freq, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i : freq.values()){
            if(i % 2 == 0){
                min = Math.min(i, min);
            }
            if(i % 2 != 0){
                max = Math.max(i, max);
            }
        }
        return Math.abs(max - min);
    }
    public static void main(String[] args) {
        
    }
}