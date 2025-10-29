/*3370. Smallest Number With All Set Bits
You are given a positive number n.

Return the smallest number x greater than or equal to n, such that the binary representation of x contains only set bits */
public class SetBits {
    // Approach 1
    // public static int smallestNum(int n){
    //     for(int i = 0; i <= n; i++){
    //         int z = 1 << i;
    //         if(z > n) return z - 1;
    //     }
    //     return 0;
    // }

    // Approach 2
    public static int smallestNum(int n){
        while((n & (n + 1)) != 0){
            n |= n + 1;
        }
        return n;
    }
    public static void main(String...args){
        int n = 5;
        System.out.println(SetBits.smallestNum(n));
    }
}
