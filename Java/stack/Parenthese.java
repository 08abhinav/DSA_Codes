import java.util.Stack;
class Parenthese{
    static boolean validParenthese(String str){
        Stack<Character> stk = new Stack<>();
        if(str.length() % 2==1) return false;

        for(char c : str.toCharArray()){
            if(c == '{' || c == '[' || c == '('){
                stk.push(c);
            }else{
                if(c == '}' && stk.pop() != '{' ||
                c == ']' && stk.pop() != '[' ||
                c == ')' && stk.pop() != '('){
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }
    public static void main(String... args){
        boolean res = Parenthese.validParenthese("{[()]}");

        if(res == true){
            System.out.println("Given parenthese are valid");
        }else{
            System.out.println("Given parenthese are not valid");
        }
    }
}