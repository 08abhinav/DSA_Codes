public class KMirrorNum {
    public static long kMirror(int k, int n){

    }

    long createPalindrome(long num, boolean odd){
        long x = num;
        if(odd) x /= 10;
        while( x > 0){
            num = num * 10 + x % 10;
            x /= 10;
        }
        return num;
    }
    public static void main(String...args){

    }
}
