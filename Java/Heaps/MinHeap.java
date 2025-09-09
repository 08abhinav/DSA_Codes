public class MinHeap {
    public static void convertToMinHeap(int arr[], int n){
        for(int i = (n - 2) / 2; i >= 0; i--){
            minHeapify(arr, i, n);
        }
    }

    public static void minHeapify(int arr[], int i, int n){
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int smallest = i;

        if(left < n && arr[left] < arr[smallest]){
            smallest = left;
        }
        if(right < n && arr[right] < arr[smallest]){
            smallest = right;
        }
        if(smallest != i){
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            minHeapify(arr, smallest, n);
        }
    }
    public static void main(String[] args) {
        
    }
}
