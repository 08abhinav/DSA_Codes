package Java.BinarySearch;

/*
Given a sorted array arr[] (0-index based) of distinct integers and an integer k, 
find the index of k if it is present in the arr[]. 
If not, return the index where k should be inserted to maintain the sorted order. 
*/
public class SearchInsertK{
    public static int searchK(int[] arr, int k){
        int low = 0, high = arr.length - 1, res = arr.length;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] >= k){
                res = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
       }
       return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        int k = 4;
        System.out.println(SearchInsertK.searchK(arr, k));
    }
}