import java.util.Stack;

public class GreatString{
    public static String makeGood(String s){
        Stack<Character> stk = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!stk.isEmpty() && Math.abs(stk.peek() - ch) == 32){
                stk.pop();
            }else{
                stk.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : stk){
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "leEeetcode";
        System.out.println(GreatString.makeGood(s));
    }
}