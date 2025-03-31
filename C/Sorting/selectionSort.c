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
    printf("You entered\n");
    print(arr);
}

void print(int arr[max]){
    for(int i=0;i<max;i++){
        printf("%d\t", arr[i]);
    }
}

