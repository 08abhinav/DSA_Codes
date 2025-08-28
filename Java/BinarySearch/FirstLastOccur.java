package Java.BinarySearch;

import java.util.ArrayList;

public class FirstLastOccur {
    public static ArrayList<Integer> findOcuur(int[] arr, int x){
        int first = firstOccur(arr, x);
        int last = lastOccur(arr, x);
        ArrayList<Integer> res = new ArrayList<>();
        res.add(first);
        res.add(last);
        return res;
    }

    public static int firstOccur(int[] arr, int x){
        int low = 0, high = arr.length - 1, res = -1;
        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == x){
                res = mid;
                high = mid - 1;
            }
            else if(arr[mid] > x){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
