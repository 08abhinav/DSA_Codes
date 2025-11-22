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
        
    }
}