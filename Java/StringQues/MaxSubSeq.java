/**Given a string s consisting of lowercase English letters and an integer k, 
your task is to remove exactly k characters from the string. 
 * The resulting string must be the largest possible in lexicographical  order, 
while maintain the relative order of the remaining characters. */
import java.util.ArrayDeque;
import java.util.Deque;

public class MaxSubSeq {
    public static String maxSubSeq(String s, int k){
        int n = s.length();
        Deque<Character> stk = new ArrayDeque<>();

        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            while(!stk.isEmpty() && k > 0 && stk.peekLast() < c){
                stk.pollLast();
                k--;
            }
            stk.addLast(c); 
        }

        while(k-- > 0){
            stk.pollLast();
        }

        StringBuilder sb = new StringBuilder();
        for(char ch : stk){
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "ritz";
        int k = 2;
        System.out.println(MaxSubSeq.maxSubSeq(s, k));
    }
}
