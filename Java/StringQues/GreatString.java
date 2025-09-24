/*1544. Make The String Great
Given a string s of lower and upper case English letters.
A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:
    0 <= i <= s.length - 2
    s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
To make the string good, you can choose two adjacent characters that make the string bad and remove them. 
You can keep doing this until the string becomes good.
Return the string after making it good. The answer is guaranteed to be unique under the given constraints.

Notice that an empty string is also good. */
import java.util.Stack;

public class GreatString{
    public static String makeGood(String s){
        // Approach 1 using stack
        // Stack<Character> stk = new Stack<>();
        // for(char ch : s.toCharArray()){
        //     if(!stk.isEmpty() && Math.abs(stk.peek() - ch) == 32){
        //         stk.pop();
        //     }else{
        //         stk.push(ch);
        //     }
        // }
        // StringBuilder sb = new StringBuilder();
        // for(char c : stk){
        //     sb.append(c);
        // }
        // return sb.toString();

        // Approach 2 using StringBuilder
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int len = res.length();
            if(len > 0 && (res.charAt(len - 1) + 32 == c || res.charAt(len - 1) - 32 == c)){
                res.deleteCharAt(len - 1);
            }else{
                res.append(c);
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String s = "leEeetcode";
        System.out.println(GreatString.makeGood(s));
    }
}