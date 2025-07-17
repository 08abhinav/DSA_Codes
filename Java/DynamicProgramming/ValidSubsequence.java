public class ValidSubsequence{
    static int maxLength(int[] nums){
        int countEven = 0, countOdd = 0;

        for(int num : nums){
            if(num % 2 == 0) countEven++;
            else countOdd++;
        }

        int evenDp = 0, oddDp = 0;
        for(int num : nums){
            if(num % 2 == 0){
                evenDp = Math.max(evenDp, oddDp + 1);
            }else{
                oddDp = Math.max(oddDp, evenDp + 1);
            }
        }

        return Math.max(Math.max(evenDp, oddDp), Math.max(countEven, countOdd));
    }
    public static void main(String[] args) {
        
    }
}