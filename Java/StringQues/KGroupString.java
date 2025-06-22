public class KGroupString {
    public static String[] divideString(String s, int k , String fill){
        int n = s.length();
        int groups = (n + k - 1) / k;
        String[] res = new String[groups];

        for(int i=0; i<groups; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<k; j++){
                int idx = i * k + j;
                if(idx < n){
                    sb.append(s.charAt(idx));
                }else{
                    sb.append(fill);
                }
            }
            res[i] = sb.toString();
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
