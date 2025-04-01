#include<stdio.h>
void print(int[], int);
void selectionSort(int[], int);

int main(){
    int arr[100], n;
    printf("Enter the size of array: ");
    scanf("%d", &n);
    arr[n];
    printf("Enter the elements\n");
    for(int i=0;i<n;i++){
        scanf("%d", &arr[i]);
    }
    printf("Before sorting\n");
    print(arr, n);
    selectionSort(arr, n);
    printf("\nAfter Sorting\n");
    print(arr, n);
}

void print(int arr[10], int max){
    for(int i=0;i<max;i++){
        printf("%d\t", arr[i]);
    }
}

void selectionSort(int arr[10],  int max){
    for(int i=0;i<max-1;i++){
        int min_ind = i;
        for(int j=i+1;j<max;j++){
            if(arr[j]<arr[min_ind]){
                min_ind = j;
            }
        }
        if(min_ind != i){
            int temp = arr[i];
            arr[i] = arr[min_ind];
            arr[min_ind] = temp;
        }
    }
}