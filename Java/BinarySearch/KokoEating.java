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