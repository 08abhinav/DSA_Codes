class SumOfSquare{
    public int getSum(int[] nums){
        int n = nums.length;
        int res = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                res += nums[i-1] * nums[i-1];
            }
        }
        return res;
    }
}