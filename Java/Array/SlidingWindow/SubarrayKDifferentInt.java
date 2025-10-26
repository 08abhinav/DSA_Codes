public class SubarrayKDifferentInt{
    public static int kDistinct(int[] nums, int k){
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }
    public static void main(String[] args) {
        
    }
}