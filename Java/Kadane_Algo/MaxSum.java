/*Kadane's Algorithm
 * It is a greedy + dyanmic programming approach to find the contiguous subarray within 1D array which has
 * the largest sum.
 */
import java.util.*;
class MaxSum{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int currSum = arr[0]; 
        int maxSum = arr[0]; 
        for(int i: arr){
            currSum = Math.max(i, currSum+i);
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Given array was: "+Arrays.toString(arr));
        System.out.println("Maximum sum of subarray is: \n and subarray is: "+maxSum);
    }
}