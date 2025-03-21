#include<stdio.h>
#define max 5
struct stack{
    int top = -1;
    int arr[max];
}typedef stk;

void push(stk *);
void pop(stk *);
void display(stk *);
void peek(stk *);

int main(){
    stk s;
    do{
        printf("1.Push\n2.Pop\n3.Display\n4.Peek\nEnter your choice: ");
        scanf("%d",&ch);
        switch(ch){
            case 1: push(&s);
            break;
            case 2: pop(&s);
            break;
            case 3: display(&s);
            break;
            case 4: peek(&s);
            break;
            default:printf("Not a valid choice\n");
        }
    }while(ch<=4);
}

