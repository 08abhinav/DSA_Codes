/**Given a string s consisting of only uppercase and lowercase characters. 
 The task is to sort uppercase and lowercase letters separately such that 
 if the ith place in the original string had an Uppercase character then 
 it should not have a lowercase character after being sorted and vice versa. */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStr{
    public static String caseSort(String s){
        List<Character> upper = new ArrayList<>();
        List<Character> lower = new ArrayList<>();

        for(char c : s.toCharArray()){
            if(Character.isUpperCase(c)){
                upper.add(c);
            }else{
                lower.add(c);
            }
        }

        Collections.sort(upper);
        Collections.sort(lower);

        StringBuilder res = new StringBuilder();
        int upperIdx = 0, lowerIdx = 0;
        for(char ch : s.toCharArray()){
            if(Character.isUpperCase(ch)){
                res.append(upper.get(upperIdx++));
            }else{
                res.append(lower.get(lowerIdx++));
            }
        }
        return res.toString();
    }
    public static void main(String[] args){
        String s = "GEekS";
        System.out.println(SortStr.caseSort(s));
    }
}