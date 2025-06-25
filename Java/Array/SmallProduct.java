public class SmallProduct{
    public static long smallestProduct(int[] nums1, int[] nums2, int k){
        long left = -10000000000L;
        long right = 10000000000L;

        while(left < right){
            long mid = left + (right - left) / 2;
            if(countProduct(nums1, nums2, mid) < k){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        
    }
}