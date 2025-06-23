/**A k-mirror number is a positive integer without leading zeros that reads the same both forward and 
backward in base-10 as well as in base-k.

For example, 9 is a 2-mirror number. The representation of 9 in base-10 and base-2 are 9 and 1001 respectively, 
which read the same both forward and backward.
On the contrary, 4 is not a 2-mirror number. The representation of 4 in base-2 is 100, 
which does not read the same both forward and backward.
Given the base k and the number n, return the sum of the n smallest k-mirror numbers */
public class KMirrorNum {
    public static long kMirror(int k, int n){
        long sum = 0;
        for(long len=1; n>0; len*=10){
            for(long i=len; n>0 && i<len*10; i++){
                long p = createPalindrome(i, true);
                if(isPalindrome(p, k)){ sum += p; n--;}
            }
            for(long i=len; n>0 && i<len*10; i++){
                long p = createPalindrome(i, false);
                if(isPalindrome(p, k)){sum += p; n--;}
            }
        }
        return sum;
    }

    private static long createPalindrome(long num, boolean odd){
        long x = num;
        if(odd) x /= 10;
        while( x > 0){
            num = num * 10 + x % 10;
            x /= 10;
        }
        return num;
    }

    private static boolean isPalindrome(long num, int base){
        StringBuilder sb = new StringBuilder();
        while(num > 0){
            sb.append((char) (num % base + '0'));
            num /= base;
        }
        String s = sb.toString();
        int i = 0, j = s.length()-1;
        while(i < j) if(s.charAt(i++) != s.charAt(j--))return false;
        return true;
    }

    public static void main(String...args){
        int n = 5, k = 2;
        System.out.println(KMirrorNum.kMirror(k, n));
    }
}
