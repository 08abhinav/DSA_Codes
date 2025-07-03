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