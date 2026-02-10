/*
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {
    public static int countSteps(int n){
        if(n <= 3) return n;

        int prev1 = 3, prev2 = 2, curr = 0;
        for(int i=3; i<=n; i++){
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(ClimbingStairs.countSteps(n));
    }
}
