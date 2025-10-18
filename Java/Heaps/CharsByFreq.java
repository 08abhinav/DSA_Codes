import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class CharsByFreq {
    public static String frequencySort(String s){
        Map<Character, Integer> map = new HashMap<>();
        for(Character c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> heap = new PriorityQueue<>();
        heap.addAll(map.entrySet());

        StringBuilder res = new StringBuilder();

        while(!heap.isEmpty()){
            Map.Entry<Character, Integer> entry = heap.poll();
            res.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        return res.toString();
    }
    public static void main(String[] args) {
        
    }
}
