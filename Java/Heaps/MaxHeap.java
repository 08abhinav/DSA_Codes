public class MaxHeap {
    public static void convertToMaxHeap(int arr[], int n){
        for(int i = (n - 2) / 2; i >=0; i--){
            maxHeapify(arr, i, n);
        }
    }
    public static void main(String... args){

    }
}
