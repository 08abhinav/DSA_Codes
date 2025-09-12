public class VowelGame{
    public static boolean doesAlicWin(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'i'){
                return true;
            }
        }
        return false;
    }
    public static void main(String...args){
        String s = "leetcoder";
        System.out.println(VowelGame.doesAlicWin(s));
    }
}