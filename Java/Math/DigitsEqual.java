/* 3461. Check If Digits Are Equal in String After Operations I
You are given a string s consisting of digits. Perform the following operation repeatedly until the string has exactly two digits:

For each pair of consecutive digits in s, starting from the first digit, calculate a new digit as the sum of the two digits modulo 10.
Replace s with the sequence of newly calculated digits, maintaining the order in which they are computed.
Return true if the final two digits in s are the same; otherwise, return false.

 */
public class DigitsEqual{
    public static boolean hasSameDigits(String s){
        int iteration = 0;
        char[] arr = s.toCharArray();

        while (arr.length - iteration != 2) {
            for (int i = 0; i < arr.length - 1 - iteration; i++) {
                arr[i] = (char)(((arr[i] - '0') + (arr[i + 1] - '0')) % 10 + '0');
            }
            iteration++;
        }
        return arr[0] == arr[1];
    }
    public static void main(String[] args) {
        String s = "3902";
        System.out.println(DigitsEqual.hasSameDigits(s));
    }
}