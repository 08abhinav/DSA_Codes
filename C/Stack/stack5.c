#include<stdio.h>
#define max 100

typedef struct stk {
    char arr[max];
    int top;
} stack;

void push(stack *, char);
char pop(stack *);
int checkValidParentheses(char []);

int main() {
    char ch[max];
    printf("Enter a string of brackets: ");
    fgets(ch, max, stdin);
    
    if (checkValidParentheses(ch)) {
        printf("Valid parentheses\n");
    } else {
        printf("Invalid parentheses\n");
    }
}

void push(stack *s, char ch) {
    if (s->top == max - 1) {
        printf("Stack overflow\n");
    } else {
        s->arr[++(s->top)] = ch;
    }
}



