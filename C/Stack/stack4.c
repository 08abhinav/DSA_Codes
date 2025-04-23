// Stack for character

#include<stdio.h>
#define max 100
typedef struct stk{
    char str[max];
    int top;
}stack;

void push(stack *);
void pop(stack *);
void display(stack *);

int main(){
    stack s;
    s.top = -1;
    int ch;
    do{
        printf("1.Push\n2.Pop\n3.Dipslay\nEnter your choice: ");
        scanf("%d",&ch);
        switch(ch){
            case 1: push(&s);
            break;

            case 2: pop(&s);
            break;

            case 3: display(&s);
            break;
        }
    }while(ch>=1 && ch<=3);
}

void push(stack *s){
    if(s->top==max-1){
        printf("Stack overflow\n");
    }else{
        char ch;
        printf("Enter character to push: ");
        scanf(" %c", &ch);
        s->str[++(s->top)] = ch;
    }
}

void pop(stack *s){
    if(s->top==-1){
        printf("Stack underflow\n");
    }else{
        printf("Popped element is: %c\n", s->str[s->top]);
        s->top --;
    }
}

void display(stack *s){
    if(s->top==-1){
        printf("Stack is empty\n");
    }else{
        for(int i=s->top; i>=0; i--){
            printf("%c\n", s->str[i]);
        }
    }
}