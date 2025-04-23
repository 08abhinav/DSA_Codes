#include<stdio.h>
#define max 100
typedef struct stk{
    char str[max];
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

void push(stack *s){
    if(s->top==max-1){
        printf("Stack overflow\n");
    }else{
        char ch;
        printf("Enter character to push: ");
        scanf("%c", &ch);
        s->str[++(s->top)] = ch;
    }
}