public class GcdStrings {
    public static String gcdOfStrings(String str1, String str2){
        if(!(str1 + str2).equals(str2 + str1)) return "";

        int g = gcd(str1.length(), str2.length());
        return str2.substring(0, g);
    }
    
    public static int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
    public static void main(String[] args) {
        String s1 = "ABABABAB", s2 = "AB";
        System.out.println(GcdStrings.gcdOfStrings(s1, s2));
    }
}
