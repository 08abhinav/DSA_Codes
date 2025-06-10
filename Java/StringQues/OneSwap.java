import java.util.HashSet;
import java.util.Set;

public class OneSwap {
    public static int countSwap(String s){
        Set<String> set = new HashSet<>();
        char[] ch = s.toCharArray();
        int n = ch.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                char temp[] = s.toCharArray();

                char c = temp[i];
                temp[i] = temp[j];
                temp[j] = c;

                set.add(new String(temp));
            }
        }
        return set.size();
    }
    public static void main(String[] args) {
        String s = "geek";
        System.out.println(OneSwap.countSwap(s));
    }
}
