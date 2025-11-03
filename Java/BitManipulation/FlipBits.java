public class FlipBits{
    public static int minBitsFlip(int x, int y){
        return Integer.bitCount(x ^ y);
    }
    public static void main(String[] args) {
        int x = 3, y = 4;
        System.out.println(minBitsFlip(x, y));
    }
}