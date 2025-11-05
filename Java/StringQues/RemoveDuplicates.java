/*316. Remove Duplicate Letters
Given a string s, remove duplicate letters so that every letter appears once and only once. 
You must make sure your result is the smallest in lexicographical order among all possible results.
*/
import java.util.Stack;
public class RemoveDuplicates{
    public static String removeDuplicateLetters(String s){
        int[] res = new int[26];
        boolean[] visited = new boolean[26];
        char[] ch = s.toCharArray();

        for(char c : ch){
            res[c - 'a']++;
        }

        Stack<Character> stk = new Stack<>();
        int idx = 0;
        for(char c : ch){
            idx = c - 'a';
            res[idx]--;
            if(visited[idx])continue;

            while(!stk.isEmpty() && c < stk.peek() && res[stk.peek() - 'a'] != 0){
                visited[stk.pop() - 'a'] = false;
            }
            stk.push(c);
            visited[idx] = true;
        }

        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.insert(0, stk.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "bcabc";
        System.out.println(removeDuplicateLetters(s));
    }
}