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

    private static long countProduct(int[] n1, int[] n2, long target){
        long count = 0;
        for(int n : n1){
            if(n == 0){
                if(target >= 0) count += n2.length;
                continue;
            }

            int low = 0, high = n2.length;
            while(low < high){
                int mid = low + (high - low) / 2;
                long product = (long) n * n2[mid];
                if(product <= target){
                    if(n > 0) low = mid + 1;
                    else high = mid;
                }else{
                    if(n > 0) high = mid;
                    else low = mid + 1;
                }
            }
            count += (n > 0) ? low : n2.length - low;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {-4,-2,0,3};
        int[] arr2 = {2, 4};
        int k = 6;
        System.out.println(SmallProduct.smallestProduct(arr, arr2, k));
    }
}