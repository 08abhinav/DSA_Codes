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

    }
}
