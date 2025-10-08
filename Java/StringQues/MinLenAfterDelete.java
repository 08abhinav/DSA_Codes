/**1750. Minimum Length of String After Deleting Similar Ends
Given a string s consisting only of characters 'a', 'b', and 'c'. 
You are asked to apply the following algorithm on the string any number of times:

Pick a non-empty prefix from the string s where all the characters in the prefix are equal.
Pick a non-empty suffix from the string s where all the characters in this suffix are equal.
The prefix and the suffix should not intersect at any index.
The characters from the prefix and suffix must be the same.
Delete both the prefix and the suffix.
Return the minimum length of s after performing the above operation any number of times (possibly zero times). */


public class MinLenAfterDelete {
    public static int minLen(String s){
        int left = 0;
        int right = s.length() - 1;
        while(left < right && s.charAt(left) == s.charAt(right)){
            char ch = s.charAt(left);
            while(left <= right && ch == s.charAt(left)){
                left++;
            }
            while(right >= left && ch == s.charAt(right)){
                right--;
            }
        }
        return right - left + 1;
    }
    public static void main(String[] args) {
        String str = "aabccabba";
        System.out.println(MinLenAfterDelete.minLen(str));
    }
}
