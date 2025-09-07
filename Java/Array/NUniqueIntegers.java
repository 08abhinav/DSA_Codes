import java.util.Arrays;

public class NUniqueIntegers {
    public static int[] sumZero(int n){
        int[] res = new int[n];
        int k = 1;
        for(int i = 0; i < n / 2 ; i++){
            res[i] = k;
            res[n - 1 - i] = -k;
            k += 1;
        }
        return res;
    }
    public static void main(String...args){
        int n = 5;
        System.out.println(Arrays.toString(NUniqueIntegers.sumZero(n)));
    }
}
