public class ClimbingStairs {
    public static int countSteps(int n){
        if(n <= 3) return n;

        int prev1 = 3, prev2 = 2, curr = 0;
        for(int i=0; i<n; i++){
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }
    public static void main(String[] args) {
        
    }
}
