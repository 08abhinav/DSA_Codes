import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class AnagramGroup{
    static List<List<String>> groupAna(String[] str){
        Map<String, List<String>> map = new HashMap<>();

        for(String s: str){
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String str[] = {"bad", "cat", "tac", "eat", "ate", "tea"};
        System.out.println(AnagramGroup.groupAna(str));
    }
}