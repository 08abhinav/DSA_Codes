package StringQues;

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
