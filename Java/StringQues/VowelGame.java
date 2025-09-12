/*3227. Vowels Game in a String
You are given a string s, Alice and Bob will take turns playing the following game where Alice starts first:
On Alice's turn, she has to remove any non-empty substring from s that contains an odd number of vowels.
On Bob's turn, he has to remove any non-empty substring from s that contains an even number of vowels.
The first player who cannot make a move on their turn loses the game. We assume that both Alice and Bob play optimally.

Return true if Alice wins the game, and false otherwise.

The English vowels are: a, e, i, o, and u. */
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