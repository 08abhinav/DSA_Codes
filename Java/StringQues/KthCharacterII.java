import java.util.ArrayList;
import java.util.List;

public class KthCharacterII {
    public static char kthChar(int k, int[] operations){
        int shifts = 0;
        List<Long> length = new ArrayList<>();
        long len = 1;
        for(int i : operations){
            len *= 2;
            length.add(len);
            if(len >= k) break;
        }

        for(int i=length.size() - 1; i>=0; i--){
            long half = length.get(i) / 2;
            int op = operations[i];

            if(k > half){
                k -= half;
                if(op == 1) shifts++;
            }
        }
        return (char)((('a' - 'a' + shifts) % 26) + 'a');
    }
    public static void main(String...args){

    }
}
