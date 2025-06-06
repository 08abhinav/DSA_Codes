/**Implementing java code for counting frequency of each character using array */
import java.util.Arrays;
class FreqArr{
    public static void main(String...args){
        String str = "abcdefghabcdijklmon";
        char[] ch = str.toCharArray();
        int[] freq = new int[26];
        for(char c : ch){
            freq[c - 'a']++;
        }

        System.out.println("Freq of each character is\n"+Arrays.toString(freq));
    }
}