/*
Implement Max Heap and then Convert the given array into max heap. 
 */
import java.util.Arrays;

public class MaxHeap {
    public static void convertToMaxHeap(int arr[], int n){
        for(int i = (n - 2) / 2; i >=0; i--){
            maxHeapify(arr, i, n);
        }
    }

    public static void maxHeapify(int arr[], int i, int n){
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if(left < n && arr[left] > arr[largest]){
            largest = left;
        }

        if(right < n && arr[right] > arr[largest]){
            largest = right;
        }

        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxHeapify(arr, largest, n);
        }
    }
    public static void main(String... args){
        int[] arr = {3, 1, 6, 5, 2, 4};
        int n = arr.length;
        MaxHeap.convertToMaxHeap(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}
