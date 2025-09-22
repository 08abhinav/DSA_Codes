public class ToHexaDecimal {
    public static String toHex(int num){
        if(num == 0) return "0";

        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder res = new StringBuilder();

        while(num != 0){
            int rem = num & 15;
            res.append(hex[rem]);
            num >>>= 4;
        }
        return res.reverse().toString();
    }
    public static void main(String...args){
        int num = 26;
        System.out.println(ToHexaDecimal.toHex(num));
    }
}
