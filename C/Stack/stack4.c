#include<stdio.h>
typedef struct stk{
    char str[];
    int top;
}stack;

void push(stack *);
void pop(stack *);

int main(){
    stack s;
    s.top = -1;
    int ch;
    do{
        printf("1.Push\n2.Pop\nEnter your choice: ");
        scanf("%d",&ch);
        switch(ch){
            case 1: push(&s);
            break;

            case 2: pop(&s);
            break;
        }
    }
}