#include<stdio.h>
#include<stdlib.h>

struct list{
    int data;
    struct list* next;
}typedef node;

node* insert(node*);
void display(node*);

int main(){
    node* head = NULL, *right = NULL;
    int ch;
    do{
        printf("1.Insert\n2.Display\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: right = insert(right);
            if(head == NULL){
                head = right;
            }
            break;

            case 2: display(head);
            break;
        }
    }
}