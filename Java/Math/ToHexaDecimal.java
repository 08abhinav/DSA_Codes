/*405. Convert a Number to Hexadecimal
Given a 32-bit integer num, return a string representing its hexadecimal representation. 
For negative integers, two’s complement method is used.

All the letters in the answer string should be lowercase characters, and there should not be any 
leading zeros in the answer except for the zero itself.

Note: You are not allowed to use any built-in library method to directly solve this problem.
*/
public class ToHexaDecimal {
    public static String toHex(int num){
        if(num == 0) return "0";

        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder res = new StringBuilder();

        while(num != 0){
            int rem = num & 15;
            res.append(hex[rem]);
            num >>>= 4;
        }
        return res.reverse().toString();
    }
    public static void main(String...args){
        int num = 26;
        System.out.println(ToHexaDecimal.toHex(num));
    }
}
