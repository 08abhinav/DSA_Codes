import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAnagrams {
    public static List<String> removeAnagrams(String[] words){
        int n = words.length;
        String[] ana = new String[n];

        for(int i = 0; i < n; i++){
            char[] ch = words[i].toCharArray();
            Arrays.sort(ch);
            ana[i] = new String(ch);
        }
        List<String> res = new ArrayList<>();
        res.add(words[0]);

        for(int i = 1; i < n; i++){
            if(!ana[i - 1].equals(ana[i])){
                res.add(words[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String[] words = {"abba", "baba", "bbaa", "cd", "cd"};
        System.out.println(RemoveAnagrams.removeAnagrams(words));
    }
}
