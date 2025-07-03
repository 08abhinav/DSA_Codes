/**You are given a string s of lowercase English letters and an integer array shifts of the same length.

Call the shift() of a letter, the next letter in the alphabet, (wrapping around so that 'z' becomes 'a').

For example, shift('a') = 'b', shift('t') = 'u', and shift('z') = 'a'.
Now for each shifts[i] = x, we want to shift the first i + 1 letters of s, x times.

Return the final string after all such shifts to s are applied. */
public class ShiftingLetters{
    public static String shifitLetters(String s, int[] shifts){
        int n = s.length(), totalShifts = 0;
        char[] ch = s.toCharArray();
        for(int i=n-1; i>=0; i--){
            totalShifts = (totalShifts + shifts[i]) % 26;
            ch[i] = (char)((ch[i] - 'a' + totalShifts) % 26 + 'a');
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        int[] shifts = {3, 5, 9};
        String s = "abc";
        System.out.println(ShiftingLetters.shifitLetters(s, shifts));
    }
}