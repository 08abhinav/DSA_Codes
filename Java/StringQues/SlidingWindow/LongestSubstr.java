/**Given a string s, find the length of the longest substring without duplicate characters */
package Java.StringQues.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstr {
    public static int LengthOfLongestSubstring(String s){
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLen = 0;
        int n = s.length();

        while(right < n){
            char c = s.charAt(right);

            if(!set.contains(c)){
                set.add(c);
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(LongestSubstr.LengthOfLongestSubstring(s));
    }
}
