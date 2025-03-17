#include<stdio.h>
#define max 5
void linearSearch(int[], int);

int main(){
    int arr[max], x;
    printf("Enter the elements in array\n");
    for(int i=0;i<max;i++){
        scanf("%d",&arr[i]);
    }
    printf("Enter the element to found in array: ");
    scanf("%d", &x);
    linearSearch(arr, x);
}

void linearSearch(int arr[max], int target){
    int found=0;
    for(int i=0;i<max;i++){
        if(arr[i]==target){
            found=i+1;
        }
    }
    if(found==0){
        printf("Element not found");
    }else{
        printf("Element found at index: %d", found);
    }
}
