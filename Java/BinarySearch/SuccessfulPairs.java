package Java.BinarySearch;

import java.util.Arrays;

public class SuccessfulPairs {
    public static int[] successPairs(int[] potions, int[] spells, long success){
        Arrays.sort(potions);
        int m = potions.length;
        int n = spells.length;
        int[] res = new int[n];

        for(int i = 0; i < n; i++){
            int idx = binarySearch(potions, spells[i], success);
            if(idx != -1){
                res[i] = m - i;
            }
        }
        return res;
    }
    public static void main(String... args){

    }
}
