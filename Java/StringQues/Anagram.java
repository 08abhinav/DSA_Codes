import java.util.Arrays;

public class Anagram {
    static boolean validAnagram(String s1, String s2){
        char[] ch = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);
        return Arrays.equals(ch, ch2);
    }

    public static void main(String...args){
        String s = "geeks";
        String s2 = "geek";
        System.out.println(Anagram.validAnagram(s, s2));
    }
}
