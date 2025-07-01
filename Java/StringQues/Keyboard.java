import java.util.ArrayList;

public class Keyboard {
    public static String[] findWords(String words[]) {
        ArrayList<String> res = new ArrayList<>();
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        for(String i : words){
            if(isInRow(i, row1) || isInRow(i, row2) || isIntRow(i, row3)){
                res.add(i);
            }
        }
        return res.toArray(new String[0]);
    }
    public static void main(String[] args) {
        
    }
}
