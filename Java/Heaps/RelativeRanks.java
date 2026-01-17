/*
506. Relative Ranks
You are given an integer array score of size n, where score[i] is the score of the ith athlete in a 
competition. All the scores are guaranteed to be unique.
The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place 
athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:

The 1st place athlete's rank is "Gold Medal".
The 2nd place athlete's rank is "Silver Medal".
The 3rd place athlete's rank is "Bronze Medal".
For the 4th place to the nth place athlete, their rank is their placement number 
(i.e., the xth place athlete's rank is "x").
Return an array answer of size n where answer[i] is the rank of the ith athlete. */
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
