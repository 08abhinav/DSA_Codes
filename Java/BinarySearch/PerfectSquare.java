class PerfectSquare{
    // Approach 1: Brute Force
    public static int floorSqrt(int n){
        if(n < 2) return n;
        int res = 0;
        for(int i = 2; i < n; i++){
            if(i * i <= n){
                res = i;
            }else{
                break;
            }
        }
        return res;
    }
}