public class ArrayEleZero{
    public static int minOps(int[] nums){
        int n = nums.length;
        int countOnes = 0;
        
        for(int x : nums){
            if(x == 1) countOnes += 1;
        }
        
        if(countOnes > 0) return n - countOnes;

        int minLen = 99;
        for(int i = 0; i < n; i++){
            int g = nums[i];
            for(int j = i; j < n; j++){
                g = gcd(g, nums[j]);
                if(g == 1){
                    minLen = Math.min(minLen, j - i + 1);
                    break;
                }
            }
        }
        if(minLen == 99) return -1;
        return (minLen - 1) + (n - 1);

    }

    private static int gcd(int a, int b){
        return b == 0 ? a : gcd(b, b % a);
    }
    public static void main(String[] args) {
        
    }
}