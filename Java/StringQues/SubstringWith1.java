/*1513. Number of Substrings With Only 1
Given a binary string s, return the number of substrings with all characters 1's. 
Since the answer may be too large, return it modulo 109 + 7. */
public class SubstringWith1{
    public static int numSub(String s){
        long total = 0, count = 0, mod = 1000000007;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                count += 1;
            }else{
                count = 0;
            }
            total = (total + count) % mod;
        }
        return (int)total;
    }
    public static void main(String[] args) {
        String s = "0110111";
        System.out.println(numSub(s));
    }
}