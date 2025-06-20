/**You are given an array arr[] of positive integers, where each element arr[i] represents the number written on the i-th ball, and a positive integer k.
Your task is to determine whether it is possible to rearrange all the balls into groups such that:


Each group contains exactly k balls.
The numbers in each group are consecutive integers */
public class GroupBalls {
    public static boolean groupBalls(int[] arr, int k){
        if(arr.length % k != 0) return false;

        int max = 0;
        for(int i : arr) max = Math.max(max, i);

        int[] freq = new int[max + k + 1];
        for(int i : arr) freq[i]++;

        for(int i=0; i<=max; i++){
            if(freq[i] > 0){
                int count = freq[i];
                for(int j=0; j<k; j++){
                    if(freq[i + j] < count) return false;
                    freq[i+j] -= count;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr = {10, 1, 2, 11};
        int k = 2;
        System.out.println(GroupBalls.groupBalls(arr, k));
    }
}
