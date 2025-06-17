import java.util.Arrays;

public class Pile{
    public static int minCoins(int[] arr, int k){
        Arrays.sort(arr);
        int n = arr.length;
        long[] prefix = new long[n + 1];
        for(int i=0; i<n; i++){
            prefix[i + 1] = prefix[i] + arr[i];
        }

        long minRemoved = Long.MAX_VALUE;

        for(int start=0; start<n; start++){
            int low = arr[start];
            int high = low + k;

            int right = upperBound(arr, high);
            long removeLeft = prefix[start];

            int countRight = n - right;
            long sumRight = prefix[n] - prefix[right];
            long removeRight = sumRight - (long) countRight * high;

            long totalRemoved = removeLeft + removeRight;
            minRemoved = Math.min(minRemoved, totalRemoved);
        }
        return (int) minRemoved;
    }

    private static int upperBound(int[] arr, int target){
        int low = 0, high = arr.length;
        while(low < high){
            int mid = (low + high) / 2;
            if(arr[mid] <= target){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return low;
    }
    public static void main(String[] args){
        int[] arr = {2, 2, 2, 2};
        int k = 0;
        System.out.println(Pile.minCoins(arr, 0));
    }
}