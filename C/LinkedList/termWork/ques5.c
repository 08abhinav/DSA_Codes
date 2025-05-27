#include<stdio.h>
#define max 8

void quickSort(int [], int, int);
int partition(int [], int, int);
void swap(int *, int *);

int main(){
    int arr[max];
    printf("Enter the elements of array\n");
    for(int i = 0; i < max; i++){
        scanf("%d", &arr[i]);
    }

    printf("Before applying quick sort:\n");
    for(int i = 0; i < max; i++){
        printf("%d\t", arr[i]);
    }

    quickSort(arr, 0, max - 1);

    printf("\nAfter applying quick sort:\n");
    for(int i = 0; i < max; i++){
        printf("%d\t", arr[i]);
    }

    return 0;
}

void swap(int *a, int *b){
    int temp = *a;
    *a = *b;
    *b = temp;
}

void quickSort(int arr[], int low, int high){
    if(low < high){
        int p = partition(arr, low, high);
        quickSort(arr, low, p - 1);
        quickSort(arr, p + 1, high);
    }
}

int partition(int arr[], int low, int high){
    int pivot = arr[low];
    int i = low + 1;
    int j = high;

    while(1){
        while(i <= high && arr[i] <= pivot)
            i++;
        while(arr[j] > pivot)
            j--;

        if(i < j){
            swap(&arr[i], &arr[j]);
        } else {
            break;
        }
    }
    swap(&arr[low], &arr[j]);
    return j;
}
