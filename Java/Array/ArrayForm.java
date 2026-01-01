import java.util.LinkedList;
import java.util.List;

public class ArrayForm {
    public static List<Integer> addToArrayForm(int[] num, int k){
        List<Integer> res = new LinkedList<>();
        int i = num.length - 1;

        while(k > 0 || i >= 0){
            if(i >= 0){
                k += num[i];
                i--;
            }
            res.addFirst(k % 10);
            k /= 10;
        }
        return res;
    }
    public static void main(String... args){
        int[] num = {1, 2, 0, 0};
        int k = 34;
        System.out.println(addToArrayForm(num, k));
    }
}
