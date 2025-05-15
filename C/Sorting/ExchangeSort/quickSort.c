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
void quickSort(int [], int, int);
int partion(int [], int, int);
void swap(int *, int *);

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

void swap(int *a, int *b){
    int temp = *a;
    *a = *b;
    *b = temp;
}

// void quickSort(int arr[], int low, int high){
//     if(low>=high){
//         return;
//     }
//     int pivot = arr[high];
//     int i = low-1;

//     for(int j=low; j<high;j++){
//         if(arr[j]<pivot){
//             i++;
//             swap(&arr[i], &arr[j]);
//         }
//     }

//     swap(&arr[i+1], &arr[high]);
//     int pi = i+1;
//     quickSort(arr, low, pi-1);
//     quickSort(arr, pi+1, high);
// }

void quickSort(int arr[], int low, int high){
    int p;
    if(low<=high){
        p = partion(arr, low, high);
        quickSort(arr, low, p-1);
        quickSort(arr, p+1, high);
    }
}

int partion(int arr[], int low, int high){
    int i, j, k, f=1;
    i = low+1;
    j=high;
    k = arr[low];
    while(f){
        while(k>arr[i] && i<=j){
            i++;
        }
        while(k<arr[j]){
            j--;
        }

        if(i<j){
            swap(&arr[i], &arr[j]);
        }else{
            f=0;
        }
    }
}
