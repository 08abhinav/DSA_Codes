import java.util.PriorityQueue;

public class RelativeRanks {
    public String[] findRelativeRank(int[] score){
        String[] res = new String[score.length];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> score[b] - score[a]);
        for(int i = 0; i < score.length; i++){
            maxHeap.add(i);
        }

        int i = 1;
        while(!maxHeap.isEmpty()){
            if(i > 3){
                res[i] = Integer.toString(i);
            }else if(i == 0){
                res[i] = "Gold Medal";
            }else if(i == 1){
                res[i] = "Silver Medal";
            }else if(i == 2){
                res[i] = "Bronze Medal";
            }
            i += 1;
        }
        return res;

    }
    public static void main(String[] args) {
        
    }
}
