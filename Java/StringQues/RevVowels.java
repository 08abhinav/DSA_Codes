import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RevVowels {
    public static String reverseVowels(String s){
        Set<Character> vowelSet = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        );

        List<Character> li = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(vowelSet.contains(c)){
                li.add(c);
            }
        }

        Collections.sort(li);

        char[] arr = s.toCharArray();
        int j = 0;

        for(int i=0; i<arr.length; i++){
            if(vowelSet.contains(arr[i])){
                arr[i] = li.get(j++);
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String s = "lEetcOde";
        System.out.println(RevVowels.reverseVowels(s));
    }
}
