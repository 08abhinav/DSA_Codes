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
    }while(ch<=3);
}

void push(stack **top){
    stack *ptr = NULL;
    ptr = (stack *)malloc(sizeof(stack));
    if(!ptr){
        printf("Memory not allocated\n");
    }else{
        int x;
        printf("Enter the value to push: ");
        scanf("%d", &x);
        ptr->data = x;
        ptr->next = NULL;
        if(*top == NULL){
            *top = ptr;
            return;
        }else{
            (*top)->next = ptr;
            *top = ptr;
        }
    }
}


void display(stack *top){
    if(top == NULL){
        printf("Stack is empty\n");
    }else{
        stack *temp = top;
        while(temp != NULL){
            printf("%d\n", temp->data);
            temp = temp->next;
        }
        printf("\n");
    }
}