/**Convert the given roman string to its corresponding integer value*/
import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static int romanToInt(String s){
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for(int i=0; i<s.length()-1; i++){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                res -= map.get(s.charAt(i));
            }else{
                res += map.get(s.charAt(i));
            }
        }
        return res + map.get(s.charAt(s.length() - 1));
    }
    public static void main(String[] args) {
        String s = "III";
        System.out.println(RomanToInt.romanToInt(s));
    }
}
