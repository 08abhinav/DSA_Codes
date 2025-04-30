#include<stdio.h>
void print(int[], int);
void bubbleSort(int[], int);

int main(){
    int n;
    printf("Enter the size of array: ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter the elements\n");
    for(int i=0;i<n;i++){
        scanf("%d", &arr[i]);
    }
    printf("Before sorting\n");
    print(arr, n);
    bubbleSort(arr, n);
    printf("\nAfter Sorting\n");
    print(arr, n);
}


void print(int arr[], int max){
    for(int i=0;i<max;i++){
        printf("%d\t", arr[i]);
    }
}

void bubbleSort(int arr[], int max){
    for(int i=0;i<max-1;i++){
        for(int j=0;j<max-i-1; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}
