import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DivideArray{
    public static int[][] minDiff(int[] nums, int k){
        // Solution 1
        // Arrays.sort(nums);
        // List<int[]> res = new ArrayList<>();
        // for(int i=0; i<nums.length; i+=3){
        //     if(nums[i+2] - nums[i] > k){
        //         return new int[0][];
        //     }
        //     res.add(new int[] {nums[i], nums[i+1], nums[i+2]});
        // }
        // return res.toArray(new int[res.size()][]);

        // Solution 2
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums){
            pq.offer(num);
        }

        List<int[]> res = new ArrayList<>();
        while(pq.size() >= 3){
            int low = pq.poll();
            int mid = pq.poll();
            int high = pq.poll();

            if(high - low <= k){
                res.add(new int[]{low, mid, high});
            }else{
                return new int[0][];
            }
        }

        return res.toArray(new int[res.size()][]);
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,8,7,9,3,5,1};
        int k = 2;
        System.out.println(Arrays.deepToString(DivideArray.minDiff(nums, k)));
    }
}   