public class SumOfTwo {
    public static int getSum(int a, int b){
        int c = 0;
        while(b != 0){
            c = a & b;
            a = a ^ b;
            b = c << 1;
        }
        return a;
    }
    public static void main(String... args){
        
    }
}
