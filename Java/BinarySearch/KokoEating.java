/*
875. Koko Eating Bananas
Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. 
The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of 
bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all 
of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
Return the minimum integer k such that she can eat all the bananas within h hours. */
import java.util.Arrays;

class KokoEating{
    public static int minEatingSpeed(int[] piles, int h){
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();

        while(low <= high){
            int k = low + (high - low) / 2;

            long totalTime = 0;
            for(int i : piles){
                totalTime += Math.ceil((double) i / k);
            }

            if(totalTime <= h){
                high = k - 1;
            }else{
                low = k + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] piles = {25,10,23,4};
        int h = 4;
        System.out.println(KokoEating.minEatingSpeed(piles, h));
    }
}