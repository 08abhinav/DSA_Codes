/*227. Basic Calculator II
Given a string s which represents an expression, evaluate this expression and return its value. 
The integer division should truncate toward zero.
You may assume that the given expression is always valid. All intermediate results will be in the range of [-231, 231 - 1].
Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval(). */

import java.util.*;
class BasicCalculator{
    public static int calculate(String s){
        s = s.trim();
        Stack<Integer> stk = new Stack<>();
        char sign = '+';
        int curr = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9'){
                curr = curr * 10 + (ch - '0');
            }
            if((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1){
                if(sign == '+'){
                    stk.push(curr);
                }else if(sign == '-'){
                    stk.push(-curr);
                }else if(sign == '*'){
                    stk.push(stk.pop() * curr);
                }else if(sign == '/'){
                    stk.push(stk.pop() / curr);
                }
                curr = 0;
                sign = ch;
            }
        }
        int sum = 0;
        while(!stk.isEmpty()){
            sum += stk.pop();
        }
        return sum;
    }
    public static void main(String[] args) {
        String s = "3 * 3 / 3";
        System.out.println(BasicCalculator.calculate(s));
    }
}