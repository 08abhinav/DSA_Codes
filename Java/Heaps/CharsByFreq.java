/*
451. Sort Characters By Frequency
Given a string s, sort it in decreasing order based on the frequency of the characters. 
The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them. */
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class CharsByFreq {
    public static String frequencySort(String s){
        Map<Character, Integer> map = new HashMap<>();
        for(Character c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> heap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        heap.addAll(map.entrySet());

        StringBuilder res = new StringBuilder();

        while(!heap.isEmpty()){
            Map.Entry<Character, Integer> entry = heap.poll();
            res.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(CharsByFreq.frequencySort(s));
    }
}
