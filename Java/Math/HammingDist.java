/*461. Hamming Distance
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, return the Hamming distance between them. */
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