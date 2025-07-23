/**Given an array arr[], find the sum of all the subarrays of the given array.

Note: It is guaranteed that the total sum will fit within a 32-bit integer range. */
public class SumSubArray {
    // Approach 1
    // public static int subArraySum(int[] arr){
    //     int n = arr.length;
    //     int sum = 0;
    //     for(int i=0; i<n; i++){
    //         for(int j=i; j<n; j++){
    //             for(int k=i; k<=j; k++){
    //                 sum += arr[k];
    //             }
    //         }
    //     }
    //     return sum;
    // }

    // Approach 2
    public static int subArraySum(int[] arr){
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += (arr[i] * (i + 1) * (n - i));
        }
        return sum;
    }
    public static void main(String... args) {
        int[] arr = {1, 2, 3};
        System.out.println(SumSubArray.subArraySum(arr));
    }
}
