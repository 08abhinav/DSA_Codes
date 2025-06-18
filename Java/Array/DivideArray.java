/**You are given an integer array nums of size n where n is a multiple of 3 and a positive integer k.

Divide the array nums into n / 3 arrays of size 3 satisfying the following condition:

The difference between any two elements in one array is less than or equal to k.
Return a 2D array containing the arrays. If it is impossible to satisfy the
conditions, return an empty array. And if there are multiple answers, return any of them. */
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