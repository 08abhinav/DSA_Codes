/**Alice and Bob are playing a game. Initially, Alice has a string word = "a".

You are given a positive integer k.

Now Bob will ask Alice to perform the following operation forever:

Generate a new string by changing each character in word to its next character in the English alphabet, 
and append it to the original word.
For example, performing the operation on "c" generates "cd" and performing the operation on "zb" 
generates "zbac".

Return the value of the kth character in word, after enough operations have been done for word to 
have at least k characters.

Note that the character 'z' can be changed to 'a' in the operation. */
public class KthCharacter{
    public static char kthChar(int k){
        StringBuilder sb = new StringBuilder("a");
        while(sb.length() < k){
            int size = sb.length();
            for(int i=0; i<size; i++){
                sb.append((char) ('a' + ((sb.charAt(i) - 'a') + 1) % 26));            
            } 
        }
        return (sb.charAt(k - 1));
    }
    public static void main(String[] args) {
        int k = 5;
        System.out.println(KthCharacter.kthChar(k));
    }
}