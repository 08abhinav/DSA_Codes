/*2273. Find Resultant Array After Removing Anagrams
You are given a 0-indexed string array words, where words[i] consists of lowercase English letters.

In one operation, select any index i such that 0 < i < words.length and words[i - 1] and words[i] are anagrams, 
and delete words[i] from words. Keep performing this operation as long as you can select an index that satisfies the conditions.

Return words after performing all operations. It can be shown that selecting the indices for each operation in any 
arbitrary order will lead to the same result.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase using all the original 
letters exactly once. For example, "dacb" is an anagram of "abdc". */
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
        String[] words = {"abba", "baba", "bbaa", "dc", "dc"};
        System.out.println(RemoveAnagrams.removeAnagrams(words));
    }
}
