/**Merge Sort
Time complexity O(nlog(n))
n time for merging array
log(n) for dividing the array
 */

#include<stdio.h>
#define max 8
void mergeSort(int[], int, int);
void merge(int[], int[], int, int, int);

int main(){
    int arr[max];
    printf("Enter the value to insert\n");
    for(int i=0;i<max;i++){
        scanf("%d", &arr[i]);
    }

    printf("Array before sorting\n");
    for(int i=0;i<max;i++){
        pirntf("%d", arr[i]);
    }

    mergeSort(arr, 0, max-1);
    printf("Array after sorting\n");
    for(int i=0;i<max;i++){
        printf("%d", arr[i]);
    }
}