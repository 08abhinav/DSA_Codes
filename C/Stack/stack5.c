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

char pop(stack *s) {
    if (s->top == -1) {
        printf("Stack underflow\n");
        return '\0';  
    } else {
        return s->arr[s->top--];  
    }
}

int checkValidParentheses(char str[max]) {
    stack s;
    s.top = -1;  
    
    for (int i = 0; str[i] != '\0'; i++) {
        char c = str[i];

        if (c == '[' || c == '{' || c == '(') {
            push(&s, c);
        }
        
        else if (c == ']' || c == '}' || c == ')') {
            if (s.top == -1) {
                return 0;  
            }
            char poppedChar = pop(&s);  
            
            if ((c == ']' && poppedChar != '[') || 
            (c == '}' && poppedChar != '{') || 
            (c == ')' && poppedChar != '(')) {
            return 0; 
        }
        }
    }
    return s.top == -1 ? 1 : 0;
}
