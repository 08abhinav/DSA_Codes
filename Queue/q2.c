//Queue using call by address
#include<stdio.h>
#define max 5

void insert(int [], int*);
void delete(int [], int*, int*);
void display(int [], int*, int*);

int main(){
    int ch, arr[max], f=-1, r=-1;
    do{
        printf("1.Insert\n2.Delete\n3.Display\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: r = insert(arr, &r);
            if(f==-1){
                f=0;
            }
            break;

            case 2: f = delete(arr, &f, &r);
            break;

            case 3: display(arr, &f, &r);
            break;
            
        }
    }while(ch<=3);
}

void insert(int arr[max], int *r){
    if(*r==max-1){
        printf("Queue is Full\n");
    }else{
        int x;
        printf("Enter the value to insert: ");
        scanf("%d", &x);
        (*r) += 1;
        arr[*r] = x;
    }
}

void delete(int arr[max], int *f, int *r){
    if(*f==-1){
        printf("Queue is empty\n");
    }else{
        printf("Delete element: %d\n", arr[*f]);
        (*f) += 1;
        if(*f>*r){
            *f=*r=-1;
        }
    }
}

void display(int arr[max], int *f, int *r){
    if(*f==-1){
        printf("Queue is empty\n");
    }else{
        printf("Element in queue\n");
        for(int i=*f; i<=*r; i++){
            printf("%d\t", arr[i]);
        }
        printf("\n");
    }
}