#include<stdio.h>
#define max 5
struct stack{
    int top;
    int arr[max];
}typedef stk;

void push(stk *);
void pop(stk *);
void display(stk *);
void peek(stk *);

int main(){
    stk s;
    s.top = -1;
    int ch;
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

void push(stk *s){
    if(s->top==max-1){
        printf("Stack overflow\n");
    }else{
        int x;
        printf("Enter the value to push: ");
        scanf("%d", &x);
        s->top += 1;
        s->arr[s->top] = x;
    }
}

void pop(stk *s){
    if(s->top== -1){
        printf("Stack underflow\n");
    }else{
        printf("Popped element: %d\n", s->arr[s->top]);
        s->top -=1;
    }
}

void display(stk *s){
    if(s->top==-1){
        printf("Stack is empty\n");
    }else{
        printf("Stack elements:\n");
        for (int i = s->top; i >= 0; i--) {
            printf("%d\n", s->arr[i]);
        }
        printf("\n");
    }
}

void peek(stk *s){
    if(s->top==-1){
        printf("Stack is empty\n");
    }else{
        printf("Peeked element: %d", s->arr[s->top]);
    }
}