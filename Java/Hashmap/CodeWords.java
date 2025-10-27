import java.util.HashMap;
import java.util.Map;

public class CodeWords {
    public static String winAll(String s){
        String[] str = s.trim().split("\\s+");
        String[] res = new String[str.length];

        for(int i = 0; i < str.length; i++){
            String code = "" + str[i].charAt(0) + str[i].charAt(str[i].length() - 1);
            res[i] = code;
        }

        Map<String, Integer> freq = new HashMap<>();
        for(String ch : res){
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        int max = 0;
        String key = "";
        for(Map.Entry<String, Integer> entry : freq.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                key = entry.getKey();
            }
        }
        return key;
    }
    public static void main(String[] args) {
        
    }
}
