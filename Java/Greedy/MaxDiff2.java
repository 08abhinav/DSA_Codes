public class MaxDiff2{
    public static int maxDiff(int num){
        String str = String.valueOf(num);

        char[] ch1 = str.toCharArray();
        char maxReplace = ' ';
        for(char c: ch1){
            if( c != '9'){
                maxReplace = c;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : ch1){
            if(c == maxReplace) sb.append('9');
            else sb.append(c);
        }

        char[] ch2 = str.toCharArray();
        char minReplace = ' ';
        char replace = ' ';

        if(ch2[0] != '1'){
            minReplace = ch2[0];
            replace  = '1';
        }else{
            for(int i=1; i<ch2.length; i++){
                if(ch2[i] != '0' && ch2[i] != '1'){
                    minReplace = ch2[i];
                    replace = '0';
                    break;
                }
            }
        }

        StringBuilder s = new StringBuilder();
        for(char c: ch2){
            if(c == minReplace) s.append(replace);
            else s.append(c);
        }
        int maxVal = Integer.parseInt(sb.toString());
        int minVal = Integer.parseInt(s.toString());

        return maxVal - minVal;
    }
    public static void main(String[] args) {

    }
}