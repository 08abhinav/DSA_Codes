import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class RemoveStars{
    // Approach 1
    // public static String removeStar(String s){
    //     Stack<Character> stk = new Stack<>();
    //     for(Character c : s.toCharArray()){
    //         if(c == '*'){
    //             stk.pop();
    //         }else{
    //             stk.push(c);
    //         }
    //     }
    //     StringBuilder res = new StringBuilder();
    //     while(!stk.isEmpty()){
    //         res.append(stk.pop());
    //     }
    //     return res.reverse().toString();
    // }

    // Approach 2
    public static String removeStar(String s){
        Deque<Character> d = new ArrayDeque<>();
        for(Character c : s.toCharArray()){
            if(c == '*') d.removeLast();
            else{
                d.add(c);
            }
        }
        StringBuilder res = new StringBuilder();
        for(char c : d){
            res.append(c);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(RemoveStars.removeStar(s));
    }
}