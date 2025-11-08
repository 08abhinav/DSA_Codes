public class OneBitOps {
    public static int minOneBitOps(int n){
        int res = 0;
        while(n > 0){
            res ^= n;
            n >>= 1;
        }
        return res;
    }
    public static void main(String...args){
        int n = 15;
        System.out.println(minOneBitOps(n));
    }
}
