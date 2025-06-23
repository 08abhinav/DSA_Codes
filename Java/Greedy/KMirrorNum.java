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

    boolean isPalindrome(long num, int base){
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

    }
}
