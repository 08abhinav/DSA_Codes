public class PowerOfTwo{
    public static boolean isPowerOfTwo(int n){
        return n > 0 && (Math.log(n) / Math.log(2)) % 1 == 0;
    }
    public static void main(String[] args) {
        int n = 16;
        System.out.println(PowerOfTwo.isPowerOfTwo(n));
    }
}