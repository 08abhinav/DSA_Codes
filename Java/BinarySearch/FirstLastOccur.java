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
    public static void main(String[] args) {
        
    }
}
