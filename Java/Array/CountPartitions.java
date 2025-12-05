/*3432. Count Partitions with Even Sum Difference
You are given an integer array nums of length n.
A partition is defined as an index i where 0 <= i < n - 1, splitting the 
array into two non-empty subarrays such that:

Left subarray contains indices [0, i].
Right subarray contains indices [i + 1, n - 1].
Return the number of partitions where the difference between the sum of the 
left and right subarrays is even. */
public class CountPartitions{
    public static int partitions(int[] nums){
        int totalSum = 0;
        for(int i : nums){
            totalSum += i;
        }

        int leftSum = 0, count = 0;
        for(int i = 0; i < nums.length - 1; i++){
            leftSum += nums[i];
            int rightSum = totalSum - leftSum;
            if((leftSum % 2) == (rightSum % 2)){
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {10, 10, 3, 7, 6};
        System.out.println(partitions(nums));
    }
}