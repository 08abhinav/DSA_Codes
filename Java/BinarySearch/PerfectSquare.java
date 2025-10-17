/* Square Root
Given a positive integer n, find the square root of n. If n is not a perfect square, then return the floor value.

Floor value of any number is the greatest Integer which is less than or equal to that number. */
class PerfectSquare{
    // Approach 1: Brute Force
    // public static int floorSqrt(int n){
    //     if(n < 2) return n;
    //     int res = 0;
    //     for(int i = 2; i < n; i++){
    //         if(i * i <= n){
    //             res = i;
    //         }else{
    //             break;
    //         }
    //     }
    //     return res;
    // }

    // Approach 2: Optimal approach using Binary Search
    public static int floorSqrt(int n){
        if(n < 2) return n;
        int left = 0, right = n / 2, ans = 0;
        while(left <= right){
            int mid = left + (right - left) / 2;

            if(mid * mid <= n){
                ans = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String... args){
        int n = 11;
        System.out.println(PerfectSquare.floorSqrt(n));
    }
}