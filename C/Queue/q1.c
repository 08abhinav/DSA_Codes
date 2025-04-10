//Simple Queue using call by value
#include<stdio.h>
#define max 5

int insert(int[], int);
int delete(int[], int);
void display(int[], int, int);

int main(){
    int ch, arr[max], f=-1, r=-1;
    do{
        printf("1.Insert\n2.Delete\n3.Display\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: r = insert(arr, r);
            if(f==-1){
                f=0;
            }
            break;

            case 2: f = delete(arr, f);
            if(f>r){
                f=r=-1;
            }
            break;

            case 3: display(arr, f, r);
            break;
            
        }
    }while(ch<=3);
}

int insert(int arr[max], int r){
    if(r==max-1){
        printf("Queue is full\n");
    }else{
        int x;
        printf("Enter the value to insert: ");
        scanf("%d", &x);
        r++;
        arr[r] = x;
    }
    return r;
}

int delete(int arr[max], int f){
    if(f==-1){
        printf("Queue is empty\n");
    }else{
        printf("Deleted item: %d\n", arr[f]);
        f++;
    }
    return f;
}

void display(int arr[max], int f, int r){
    if(f==-1){
        printf("Queue is empty\n");
    }else{
        printf("Queue items\n");
        for(int i=f;i<=r;i++){
            printf("%d\t", arr[i]);
        }
        printf("\n");
    }
}
