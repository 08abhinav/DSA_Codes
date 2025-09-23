import java.util.Stack;

public class ReversePolishNotation {
    public static int evalRPN(String[] tokens){
        Stack<Integer> stk = new Stack<>();
        for(String i : tokens){
            if(i.equals("+") || i.equals("-") || i.equals("*") || i.equals("/")){
                int b = stk.pop();
                int a = stk.pop();
                int res = 0;

                switch (i) {
                    case "+": res = a + b; break; 
                    case "-": res = a - b; break; 
                    case "*": res = a * b; break; 
                    case "/": res = a / b; break; 
                }

                stk.push(res);
            }else{
                stk.push(Integer.parseInt(i));
            }
        }
        return stk.pop();
    }
    public static void main(String...args){
        String[] s = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(ReversePolishNotation.evalRPN(s));
    }
}
