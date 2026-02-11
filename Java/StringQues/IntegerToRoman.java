/*
Leetcode problem-> Integer to Roman conversion
*/
public class IntegerToRoman {
    public static String integerToRoman(int num){
        final int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] symbols = {"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder s = new StringBuilder();
        for(int i=0; i<nums.length; i++){
            if(num == 0){
                break;
            }
            while(num >= nums[i]){
                s.append(symbols[i]);
                num -= nums[i];
            }
        }
        return s.toString();
    }
    public static void main(String[] args) {
        int num = 2002;
        System.out.println(IntegerToRoman.integerToRoman(num));
    }
}
