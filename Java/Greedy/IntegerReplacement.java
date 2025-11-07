/*397. Integer Replacement
Given a positive integer n, you can apply one of the following operations:

If n is even, replace n with n / 2.
If n is odd, replace n with either n + 1 or n - 1.
Return the minimum number of operations needed for n to become 1. */
public class IntegerReplacement {
    public static int integerReplace(int n){
        if(n == Integer.MAX_VALUE) return 32;
        int count = 0;
        while(n > 1){
            if(n % 2 == 0) n /= 2;
            else{
                if((n + 1) % 4 == 0 && (n - 1 != 2)) n += 1;
                else n -= 1;
            }
            count += 1;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 11;
        System.out.println(integerReplace(n));
    }
}
