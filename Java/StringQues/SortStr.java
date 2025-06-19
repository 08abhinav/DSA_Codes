import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections;
import java.util.List;

public class SortStr{
    public static String caseSort(String s){
        List<Character> upper = new ArrayList();
        List<Character> lower = new ArrayList();

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