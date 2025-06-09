class MaxProd{
    public static int calcProd(int[] nums){
        if(nums.length == 0) return 0;
        int maxProd = nums[0];
        int minProd = nums[0];
        int res = nums[0];

        for(int i=1; i<nums.length; i++){
            int currProd = nums[i];

            int tempMax = Math.max(currProd, Math.max(currProd * maxProd, currProd * minProd));
            int tempMin = Math.min(currProd, Math.min(currProd * maxProd, currProd * minProd));

            maxProd = tempMax;
            minProd = tempMin;

            res = Math.max(res, maxProd);
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}