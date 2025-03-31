#include<stdio.h>
#define max 5
void print(int[]);
void selectionSort(int[]);

int main(){
    int arr[max];
    printf("Enter the elements\n");
    for(int i=0;i<max;i++){
        scanf("%d", &arr[i]);
    }
    printf("Before sorting\n");
    print(arr);
    selectionSort(arr);
    printf("\nAfter Sorting\n");
    print(arr);
}

void print(int arr[max]){
    for(int i=0;i<max;i++){
        printf("%d\t", arr[i]);
    }
}

void selectionSort(int arr[max]){
    for(int i=0;i<max-1;i++){
        int min_ind = i;
        for(int j=i+1;j<max;j++){
            if(arr[j]<arr[min_ind]){
                min_ind = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[min_ind];
        arr[min_ind] = temp;
    }
}