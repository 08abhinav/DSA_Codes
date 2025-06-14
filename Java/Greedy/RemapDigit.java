public class RemapDigit{
    public static int maxDiff(int num){
        char[] maxChars = String.valueOf(num).toCharArray();
        char[] minChars = String.valueOf(num).toCharArray();

        char replaceMaxDigit = ' ';
        for(char c: maxChars){
            if(c != '9'){
                replaceMaxDigit = c;
                break;
            }
        }

        for(int i=0; i<maxChars.length; i++){
            if(maxChars[i] == replaceMaxDigit){
                maxChars[i] = '9';
            }
        }

        char replaceMinDigit = minChars[0];
        for(int i=0; i<minChars.length; i++){
            if(minChars[i] == replaceMinDigit){
                minChars[i] = '0';
            }
        }

        int maxVal = Integer.parseInt(new String(maxChars));
        int minVal = Integer.parseInt(new String(minChars));

        return maxVal - minVal;
    }
    public static void main(String[] args) {
        int num = 11891;
        System.out.println(RemapDigit.maxDiff(num));
    }
}