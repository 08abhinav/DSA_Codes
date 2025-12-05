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