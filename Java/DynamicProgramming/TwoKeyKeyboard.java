public class TwoKeyKeyboard {
    public static int minStep(int n){
        if(n == 1) return 0;
        int res = 0, factor = 0;
        while(n > 1){
            while(n % factor == 0){
                res += factor;
                n /= factor;
            }
            factor += 1;
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
