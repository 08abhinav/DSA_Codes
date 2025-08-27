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
        
    }
}