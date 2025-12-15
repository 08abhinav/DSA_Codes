package SlidingWindow;

public class ProductK {
    public static int getProduct(int[] nums, int k){
        if(k <= 1) return 0;
        int left = 0, res = 0, product = 1;

        for(int i = 0; i < nums.length; i++){
            product *= nums[i];
            while(product >= k){
                product /= nums[left];
                left += 1;
            }
            res += (i - left + 1);
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
