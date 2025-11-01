public class HammingDist{
    public static int hammingDistance(int x, int y){
        int res = x ^ y;
        return Integer.bitCount(res);
    }
    public static void main(String... args){
    }
}