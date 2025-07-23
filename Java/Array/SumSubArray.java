public class SumSubArray {
    // Approach 1
    public static int subArraySum(int[] arr){
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                }
            }
        }
        return sum;
    }
    public static void main(String... args) {
        
    }
}
