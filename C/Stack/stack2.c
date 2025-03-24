#include<stdio.h>
#define max 5
void push(int[], int*);
void pop(int[], int*);
void display(int[], int*);
void peek(int[], int*);

int main(){
    int top=-1, arr[max], ch;
    do{
        printf("1.Push\n2.Pop\n3.Display\n4.Peek\nEnter your choice: ");
        scanf("%d",&ch);
        switch(ch){
            case 1: push(arr, &top);
            break;
            case 2: pop(arr, &top);
            break;
            case 3: display(arr, &top);
            break;
            case 4: peek(arr, &top);
            break;
            default:printf("Not a valid choice\n");
        }
    }while(ch<=4);
}

void push(int arr[max], int *top){
    if(*top==max-1){
        printf("Stack overflow\n");
        return;
    }else{
        int x;
        printf("Enter the value to push: ");
        scanf("%d", &x);
        *top=*top+1;
        arr[*top]=x;
    }
}

void pop(int arr[max], int *top){
    if(*top==-1){
        printf("Stack underflow\n");
        return;
    }else{
        printf("Popped element is: %d\n", arr[*top]);
        *top=*top-1;
    }
}

void display(int arr[max], int *top){
    if(*top==-1){
        printf("Stack is empty\n");
    }else{
        
        printf("Elements inside stack\n");
        for(int i=*top;i>=0;i--){
            printf("%d\n", arr[i]);
        }
    }
}

void peek(int arr[max], int *top){
    if(*top==-1){
        printf("Stack is empty\n");
    }else{
        printf("Peek element is: %d\n", arr[*top]);
    }
}
