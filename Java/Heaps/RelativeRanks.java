import java.util.Arrays;
import java.util.PriorityQueue;

public class RelativeRanks {
    public static String[] findRelativeRank(int[] score){
        String[] res = new String[score.length];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> score[b] - score[a]);
        for(int i = 0; i < score.length; i++){
            maxHeap.add(i);
        }
        int rank = 1;
        while (!maxHeap.isEmpty()) {
            int index = maxHeap.poll();
            if (rank == 1) {
                res[index] = "Gold Medal";
            } else if (rank == 2) {
                res[index] = "Silver Medal";
            } else if (rank == 3) {
                res[index] = "Bronze Medal";
            } else {
                res[index] = Integer.toString(rank);
            }
            rank++;
        }
        return res;

    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 4};
        System.out.println(Arrays.toString(RelativeRanks.findRelativeRank(arr)));
    }
}
