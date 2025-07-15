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