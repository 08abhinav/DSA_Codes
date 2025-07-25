import java.util.Arrays;

public class TripletSum {
    public static boolean hasTriple(int[] arr, int target){
        Arrays.sort(arr);
        int n = arr.length;

        for(int i=0; i<n-2; i++){
            int l = i + 1, r = n - 1;
            int res = target - arr[i];

            while(l < r){
                if(arr[l] + arr[r] == res){
                    return true;
                }

                if(arr[l] + arr[r] < res) l++;
                else if(arr[l] + arr[r] > res) r--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
    }
}
