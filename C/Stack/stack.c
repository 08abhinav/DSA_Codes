#include<stdio.h>
#define max 5
int push(int[], int);
int pop(int[], int);
void display(int[], int);
void peek(int[], int);

int main(){
    int top=-1, arr[max], ch;
    do{
        printf("1.Push\n2.Pop\n3.Display\n4.Peek\nEnter your choice: ");
        scanf("%d",&ch);
        switch(ch){
            case 1: top = push(arr, top);
            break;
            case 2: top = pop(arr, top);
            break;
            case 3: display(arr, top);
            break;
            case 4: peek(arr, top);
            break;
            default:printf("Not a valid choice\n");
        }
    }while(ch<=4);
}

int push(int arr[max], int top){
    if(top==max-1){
        printf("Stack overflow\n");
    }else{
        int x;
        printf("Enter the value to push: ");
        scanf("%d", &x);
        top++;
        arr[top]=x;
    }
    return top;
}

int pop(int arr[max], int top){
    if(top==-1){
        printf("Stack underflow\n");
    }else{
        printf("Popped element is: %d\n", arr[top]);
        top--;
    }
    return top;
}

void display(int arr[max], int top){
    if(top==-1){
        printf("Stack is empty\n");
    }else{
        printf("Elements inside stack\n");
        while(top!=-1){
            printf("%d\n", arr[top]);
            top--;
        }
    }
}

void peek(int arr[max], int top){
    if(top==-1){
        printf("Stack is empty\n");
    }else{
        printf("Peek element is: %d\n", arr[top]);
    }
}