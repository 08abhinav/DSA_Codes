/*Implementing Quick sort 
->Qucik sort is Divide and Conquer algo:
--  1-> Choose a pivot element.
    2-> Partition the array into two halfs:
        2.1-> Elements smaller than the pivot will be in its left.
        2.2-> Elements greater than the pivot will be in its right.
    3-> using recursion repeat step 2.1 and 2.2

-- Time Complexity
Best/Average: O(n log(n))
Worst case: O(n^2) when pivot is always smallest or largest element.
*/
#include<stdio.h>
#define max 5
void quickSort(int arr[], int, int);

int main(){
    int arr[max];
    printf("Enter the elements of array\n");
    for(int i=0;i<max;i++){
        scanf("%d",&arr[i]);
    }
    printf("Before applying quick sort\n");
    for(int i=0;i<max;i++){
        printf("%d\t", arr[i]);
    }
    quickSort(arr, 0, max-1);
    printf("\nAfter applying quick sort\n");
    for(int i=0;i<max;i++){
        printf("%d\t", arr[i]);
    }
}

void quickSort(int arr[], int low, int high){
    if(low>=high){
        return;
    }
    int pivot = arr[high];
    int i = low-1;

    for(int j=low; j<high;j++){
        if(arr[j]<pivot){
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    int temp = arr[i+1];
    arr[i+1] = arr[high];
    arr[high] = temp;

    int pi = i+1;
    quickSort(arr, low, pi-1);
    quickSort(arr, pi+1, high);
}