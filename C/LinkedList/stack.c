#include<stdio.h>
#include<stdlib.h>

typedef struct list{
    int data;
    struct list *next;
}stack;

void push(stack **);
void pop(stack **);
void display(stack *);

int main(){
    int ch;
    stack *top;
    do{
        printf("1.Push\n2.Pop\n3.Display\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: push(&top);
            break;

            case 2: pop(&top);
            break;

            case 3: display(top);
            break;
        }
    }
}