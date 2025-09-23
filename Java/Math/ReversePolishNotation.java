/*150. Evaluate Reverse Polish Notation
You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
Evaluate the expression. Return an integer that represents the value of the expression.
Note that:

The valid operators are '+', '-', '*', and '/'.
Each operand may be an integer or another expression.
The division between two integers always truncates toward zero.
There will not be any division by zero.
The input represents a valid arithmetic expression in a reverse polish notation.
The answer and all the intermediate calculations can be represented in a 32-bit integer. */

import java.util.Stack;
public class ReversePolishNotation {
    public static int evalRPN(String[] tokens){
        Stack<Integer> stk = new Stack<>();
        // for(String i : tokens){
        //     if(i.equals("+") || i.equals("-") || i.equals("*") || i.equals("/")){
        //         int b = stk.pop();
        //         int a = stk.pop();
        //         int res = 0;

        //         switch (i) {
        //             case "+": res = a + b; break; 
        //             case "-": res = a - b; break; 
        //             case "*": res = a * b; break; 
        //             case "/": res = a / b; break; 
        //         }

        //         stk.push(res);
        //     }else{
        //         stk.push(Integer.parseInt(i));
        //     }
        // }
        // return stk.pop();

        for(String i : tokens){
            if(i.equals("+")){
                stk.push(stk.pop() + stk.pop());
            }else if(i.equals("-")){
                int b = stk.pop(), a = stk.pop();
                stk.push(a - b);
            }else if(i.equals("*")){
                stk.push(stk.pop() * stk.pop());
            }else if(i.equals("/")){
                int b = stk.pop(), a = stk.pop();
                stk.push(a / b);
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
