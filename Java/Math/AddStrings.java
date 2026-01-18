/*
415. Add Strings
Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 
as a string.

You must solve the problem without using any built-in library for handling large integers 
(such as BigInteger). You must also not convert the inputs to integers directly. */
public class AddStrings {
    public static String add(String num1, String num2){
        int i = num1.length() - 1, j = num2.length() - 1;
        int carry = 0;
        StringBuilder res = new StringBuilder();

        while(i >=0 || j >= 0 || carry != 0){
            int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j) - '0' : 0;

            int total = digit1 + digit2 + carry;
            carry = total / 10;

            res.append(total % 10);
            i--;
            j--;
        }
        return res.reverse().toString();
    }
    public static void main(String[] args) {
        String num1 = "456"; 
        String num2 = "77"; 
        System.out.println(AddStrings.add(num1, num2));
    }
}
