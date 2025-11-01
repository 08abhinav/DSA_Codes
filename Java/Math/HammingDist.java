public class HammingDist{
    public static int hammingDistance(int x, int y){
        int res = x ^ y;
        return Integer.bitCount(res);
    }
    public static void main(String... args){
        int x = 4;
        int y = 1;
        System.out.println(HammingDist.hammingDistance(x, y));
    }
}