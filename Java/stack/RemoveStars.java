import java.util.Stack;

public class RemoveStars{
    // Approach 1
    public static String removeStar(String s){
        Stack<Character> stk = new Stack<>();
        for(Character c : s.toCharArray()){
            if(c == '*'){
                stk.pop();
            }else{
                stk.push(c);
            }
        }
        StringBuilder res = new StringBuilder();
        while(!stk.isEmpty()){
            res.append(stk.pop());
        }
        return res.reverse().toString();
    }
    public static void main(String[] args) {
        
    }
}