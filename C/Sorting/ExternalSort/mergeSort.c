/**Merge Sort
Time complexity O(nlog(n))
n time for merging array
log(n) for dividing the array
 */

 #include<stdio.h>
 #define max 8
 
 void mergeSort(int[], int, int);
 void merge(int[], int[], int, int, int);
 
 int main() {
    int arr[max];
    printf("Enter the values to insert:\n");
    for(int i = 0; i < max; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Array before sorting:\n");
    for(int i = 0; i < max; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    mergeSort(arr, 0, max - 1);

    printf("Array after sorting:\n");
    for(int i = 0; i < max; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
 }
 
 void mergeSort(int arr[], int low, int high) {
     int mid, temp[max];
     if(low < high) {
        mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, temp, low, mid, high);
     }
 }
 
 void merge(int arr[], int temp[], int low, int mid, int high) {
     int i = low, j = mid + 1, k = 0;
 
     while(i <= mid && j <= high) {
        if(arr[i] < arr[j]) {
            temp[k++] = arr[i++];
        } else {
            temp[k++] = arr[j++];
        }
     }
 
     while(i <= mid) {
        temp[k++] = arr[i++];
     }
 
     while(j <= high) {
        temp[k++] = arr[j++];
     }
 
     for(int i = 0; i < k; i++) {
        arr[low + i] = temp[i];
     }
 }
 