public class DigitSum{
    public static String digitSum(String s, int k){
        while(s.length() > k){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < s.length(); i += k){
                int sum = 0;
                for(int j = i; j < Math.min(i + k, s.length()); j++){
                    sum += s.charAt(j) - '0';
                }
                sb.append(sum);
            }
            s = sb.toString();
        }
        return s;
    }
    public static void main(String...args){
        String s = "11111222223";
        System.out.println(DigitSum.digitSum(s, 3));
    }
}