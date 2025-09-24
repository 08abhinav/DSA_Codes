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