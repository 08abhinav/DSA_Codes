/**A string s can be partitioned into groups of size k using the following procedure:

The first group consists of the first k characters of the string, the second group consists
of the next k characters of the string, and so on. Each element can be a part of exactly one group.
For the last group, if the string does not have k characters remaining, a character fill is
used to complete the group.
Note that the partition is done so that after removing the fill character from the last group 
(if it exists) and concatenating all the groups in order, the resultant string should be s.

Given the string s, the size of each group k and the character fill, return a string array 
denoting the composition of every group s has been divided into, using the above procedure. */
import java.util.Arrays;

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
        String s = "abcdefghi";
        // String s = "abcdefghij";
        int k = 3;
        String fill = "x";
        System.out.println(Arrays.toString(KGroupString.divideString(s, k, fill)));
    }
}
