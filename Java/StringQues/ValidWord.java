/**A word is considered valid if:

It contains a minimum of 3 characters.
It contains only digits (0-9), and English letters (uppercase and lowercase).
It includes at least one vowel.
It includes at least one consonant.
You are given a string word.

Return true if word is valid, otherwise, return false.

 */
public class ValidWord{
    public static boolean isValid(String word){
        int n = word.length();
        if(n < 3) return false;

        int vowels = 0;
        int consonants = 0;

        for(char c : word.toCharArray()){
            if(Character.isLetter(c)){
                if("aeiouAEIOU".indexOf(c) != -1) vowels++;
                else consonants++;
            }else if(!Character.isDigit(c)) return false;
        }
        return vowels >= 1 && consonants >= 1;
    }
    public static void main(String... args){
        String word = "2a3bcde";
        System.out.println(ValidWord.isValid(word));
    }
}