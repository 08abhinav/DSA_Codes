/**Given an array of strings words, return the words that can be typed using letters of the 
 * alphabet on only one row of American keyboard like the image below.

Note that the strings are case-insensitive, both lowercased and uppercased of the same letter 
are treated as if they are at the same row.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm". */
import java.util.ArrayList;
import java.util.Arrays;

public class Keyboard {
    public static String[] findWords(String words[]) {
        ArrayList<String> res = new ArrayList<>();
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        for(String i : words){
            if(isInRow(i, row1) || isInRow(i, row2) || isInRow(i, row3)){
                res.add(i);
            }
        }
        return res.toArray(new String[0]);
    }

    private static boolean isInRow(String s, String row){
        for(char c:s.toCharArray()){
            if(row.indexOf(Character.toLowerCase(c)) == -1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String[] word = {"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(Keyboard.findWords(word)));
    }
}
