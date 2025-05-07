/**Binary search
Time complexity O(log(n)) 
*/
#include<stdio.h>
#define max 5
void binarySearch(int[], int, int, int);

int main(){
    int arr[max], x;
    printf("Enter the elements in array\n");
    for(int i=0;i<max;i++){
        scanf("%d", &arr[i]);
    }
    printf("Enter the value to found: ");
    scanf("%d", &x);
    binarySearch(arr, 0, max-1, x);
}

void binarySearch(int arr[max], int low, int high, int target){
    int found=0;
    while(low<=high){
        int mid_ind = low+(high-low)/2;

        if(arr[mid_ind]==target){
            printf("Target found at index: %d\n", mid_ind+1);
            return;
        }
        else if(arr[mid_ind]<target){
            low = mid_ind+1;
        }
        else{
            high = mid_ind-1;
        }
    }
    printf("Target not found");
}
