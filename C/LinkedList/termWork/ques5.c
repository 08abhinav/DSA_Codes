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
