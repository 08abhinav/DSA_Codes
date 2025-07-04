/**Alice and Bob are playing a game. Initially, Alice has a string word = "a".

You are given a positive integer k. You are also given an integer array operations, 
where operations[i] represents the type of the ith operation.

Now Bob will ask Alice to perform all operations in sequence:

If operations[i] == 0, append a copy of word to itself.
If operations[i] == 1, generate a new string by changing each character in word to its 
next character in the English alphabet, and append it to the original word. For example, 
performing the operation on "c" generates "cd" and performing the operation on "zb" generates "zbac".
Return the value of the kth character in word after performing all the operations.

Note that the character 'z' can be changed to 'a' in the second type of operation. */
import java.util.ArrayList;
import java.util.List;

public class KthCharacterII {
    public static char kthCharII(int k, int[] operations){
        int shifts = 0;
        List<Long> length = new ArrayList<>();
        long len = 1;
        for(int i : operations){
            len *= 2;
            length.add(len);
            if(len >= k) break;
        }

        for(int i=length.size() - 1; i>=0; i--){
            long half = length.get(i) / 2;
            int op = operations[i];

            if(k > half){
                k -= half;
                if(op == 1) shifts++;
            }
        }
        return (char)((('a' - 'a' + shifts) % 26) + 'a');
    }
    public static void main(String...args){
        int k = 5;
        int[] op = {0, 0, 0};
        // int[] op = {0, 1, 0, 0};
        System.out.println(KthCharacterII.kthCharII(k, op));
    }
}
