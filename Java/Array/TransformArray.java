public class TransformArray{
    public static int[] constructTransformedArray(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            res[i] = nums[(((i + nums[i]) % n) + n) % n];
        }
        return res;
    }
    public static void main(String... args){
        
    }
}