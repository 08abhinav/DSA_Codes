#include<stdio.h>
void print(int[], int);
void insertionSort(int[], int);

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
    insertionSort(arr, n);
    printf("\nAfter Sorting\n");
    print(arr, n);
}

void print(int arr[], int max){
    for(int i=0;i<max;i++){
        printf("%d\t", arr[i]);
    }
}

void insertionSort(int arr[], int max){
    for(int i=1; i<max;i++){
        int temp = arr[i];
        int j = i-1;
        while(j>=0 && temp<arr[j]){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = temp; 
    }
}