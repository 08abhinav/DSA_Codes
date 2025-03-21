#include<stdio.h>
#define max 5
struct stack{
    int top = -1;
}typedef stk;

int main(){
    int top=-1, arr[max], ch;
    do{
        printf("1.Push\n2.Pop\n3.Display\n4.Peek\nEnter your choice: ");
        scanf("%d",&ch);
        switch(ch){
            case 1: push(arr, top);
            break;
            case 2: pop(arr, &top);
            break;
            case 3: display(arr, &top);
            break;
            case 4: peek(arr, &top);
            break;
            default:printf("Not a valid choice\n");
        }
    }while(ch<=4);
}