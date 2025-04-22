//Reversing the singly linked list
#include<stdio.h>
#include<stdlib.h>

typedef struct list{
    int data;
    struct list *next;
}node;

node* insert(node *);
void display(node *);
void reverse(node *);

int main(){
    node *r=NULL, *h=NULL;
    int ch;
    do{
        printf("1.Insert\n2.Display\n3.Reverse\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: r = insert(r);
            if(h==NULL){
                h = r;
            }
            break;

            case 2: display(h);
            break;

            case 3: reverse(h);
            break;
        }
    }while(ch>=1 && ch<=3);
}