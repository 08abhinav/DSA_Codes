/*2300. Successful Pairs of Spells and Potions
You are given two positive integer arrays spells and potions, of length n and m respectively, where spells[i] 
represents the strength of the ith spell and potions[j] represents the strength of the jth potion.

You are also given an integer success. A spell and potion pair is considered successful if the product of their 
strengths is at least success.

Return an integer array pairs of length n where pairs[i] is the number of potions that will form a successful 
pair with the ith spell. */
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
                res[i] = m - idx;
            }
        }
        return res;
    }

    public static int binarySearch(int[] potions, long strength, long success){
        int idx = -1;
        int low = 0, high = potions.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(potions[mid] * strength >= success){
                idx = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return idx;
    }

    public static void main(String... args){
        int[] potions = {2, 1, 3, 5, 4};
        int[] spells = {5, 1, 3};
        int success = 7;
        System.out.println(Arrays.toString(SuccessfulPairs.successPairs(potions, spells, success)));
    }
}
